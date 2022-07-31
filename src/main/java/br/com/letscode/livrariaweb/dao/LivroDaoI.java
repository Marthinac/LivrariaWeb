package br.com.letscode.livrariaweb.dao;

import br.com.letscode.livrariaweb.model.Livro;
import java.util.List;

public interface LivroDaoI {
    Livro save(Livro livro);
    List<Livro> findAll();
}