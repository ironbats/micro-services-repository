package br.com.fornecedor.repository;

import br.com.fornecedor.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Long> {
}
