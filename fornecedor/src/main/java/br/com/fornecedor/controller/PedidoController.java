package br.com.fornecedor.controller;

import br.com.fornecedor.dto.ItensPedidoDTO;
import br.com.fornecedor.service.InfoFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/processa-pedido")
public class PedidoController {

    @Autowired
    private InfoFornecedorService infoFornecedorService;

    @PostMapping
    public void processaPedido(@RequestBody  List<ItensPedidoDTO> pedidos){

        infoFornecedorService.realizaPedido(pedidos);
    }
}
