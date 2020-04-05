package br.com.loja.controller;

import br.com.loja.dto.CompraDTO;
import br.com.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedor")
public class CompraController {


    @Autowired
    private CompraService compraService;

    @PostMapping("/informacoes")
    public void informacoesFornecedor(@RequestBody CompraDTO compraDTO){

        compraService.informacoesFornecedor(compraDTO);
    }

    @PostMapping("/pedido")
    public void realizaPedido(@RequestBody CompraDTO compraDTO){

        compraService.realizaPedido(null);
    }


}
