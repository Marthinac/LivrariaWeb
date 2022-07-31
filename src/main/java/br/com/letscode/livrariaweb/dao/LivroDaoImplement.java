package br.com.letscode.livrariaweb.dao;

import br.com.letscode.livrariaweb.bo.LivroBusinessObjectI;
import br.com.letscode.livrariaweb.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroDaoImplement implements LivroBusinessObjectI {

    final private static List<Livro> bancoDeLivros = new ArrayList<>();
    @Override
    public Livro save(Livro livro){
        bancoDeLivros.add(livro);
        return livro;
    }

    @Override
    public List<Livro> findAll(){
        return bancoDeLivros;
    }

}

