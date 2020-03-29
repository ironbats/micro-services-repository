package br.com.fornecedor.repository;

import br.com.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor,Long> {


    InfoFornecedor findByEstado(String estado);


}
