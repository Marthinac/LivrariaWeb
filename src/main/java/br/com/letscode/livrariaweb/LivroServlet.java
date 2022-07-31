package br.com.letscode.livrariaweb;

import br.com.letscode.livrariaweb.bo.LivroBusinessObjectI;
import br.com.letscode.livrariaweb.model.Livro;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/livro-servlet")
public class LivroServlet extends HttpServlet {

    private LivroBusinessObjectI livroBusinessObjectI;
    @Inject
    public LivroServlet(LivroBusinessObjectI livroBusinessObjectI) {
        this.livroBusinessObjectI = livroBusinessObjectI;
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Starting Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Starting Post");

        String nome = req.getParameter("nome");
        String autor = req.getParameter("autor");
        Livro livro = new Livro(nome,autor);
        livroBusinessObjectI.save(livro);

        List<Livro> livros = livroBusinessObjectI.findAll();
        req.setAttribute("livros", livros);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/lista-livros.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Ending Servlet");
    }
}
