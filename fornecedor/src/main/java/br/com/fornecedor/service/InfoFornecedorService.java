package br.com.fornecedor.service;

import br.com.fornecedor.model.InfoFornecedor;

public interface InfoFornecedorService {

    InfoFornecedor getInfoPorEstado(String estado);
}
