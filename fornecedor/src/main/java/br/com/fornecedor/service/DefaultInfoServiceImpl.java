package br.com.fornecedor.service;

import br.com.fornecedor.model.InfoFornecedor;
import br.com.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultInfoServiceImpl  implements InfoFornecedorService{

    @Autowired
    private InfoRepository infoRepository;

    @Override
    public InfoFornecedor getInfoPorEstado(String estado) {

       return  infoRepository.findByEstado(estado);
    }
}
