package br.com.letscode.livrariaweb.bo;

import br.com.letscode.livrariaweb.dao.LivroDaoI;
import br.com.letscode.livrariaweb.model.Livro;
import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

public class LivroBusinessObjectImpl implements LivroBusinessObjectI {

    private LivroDaoI livroDao;

    @Inject
    public LivroBusinessObjectImpl(LivroDaoI livroDao) {
        this.livroDao = livroDao;
    }

    @Override
    public Livro save(Livro livro) {
        valida(livro);
        return livroDao.save(livro);
    }

    @Override
    public List<Livro> findAll() {
        return livroDao.findAll();
    }

    private void valida(Livro livro) {
        if(Objects.isNull(livro.getNome())){
            throw new IllegalArgumentException("Invalid name");
        }
    }
}