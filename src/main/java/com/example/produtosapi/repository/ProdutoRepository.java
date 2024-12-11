package com.example.produtosapi.repository;

import com.example.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// Interface do repositório sem ponto e vírgula e sem chaves desnecessárias
public interface ProdutoRepository extends JpaRepository<Produto, String> {

List<Produto> findByNome(String nome);

}
