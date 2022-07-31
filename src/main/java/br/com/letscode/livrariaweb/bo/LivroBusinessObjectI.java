package br.com.letscode.livrariaweb.bo;

import br.com.letscode.livrariaweb.model.Livro;
import java.util.List;

public interface LivroBusinessObjectI {
    Livro save(Livro livro);
    List<Livro> findAll();

}
