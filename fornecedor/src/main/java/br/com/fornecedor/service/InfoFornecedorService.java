package br.com.fornecedor.service;

import br.com.fornecedor.dto.ItensPedidoDTO;
import br.com.fornecedor.model.InfoFornecedor;

import java.util.List;

public interface InfoFornecedorService {

    InfoFornecedor getInfoPorEstado(String estado);


    void realizaPedido(List<ItensPedidoDTO> pedidos);

}
