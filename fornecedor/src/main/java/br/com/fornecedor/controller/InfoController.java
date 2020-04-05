package br.com.fornecedor.controller;

import br.com.fornecedor.model.InfoFornecedor;
import br.com.fornecedor.service.InfoFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoFornecedorService infoFornecedorService;

    @GetMapping(value = "/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable  String estado){
            return infoFornecedorService.getInfoPorEstado(estado);
    }
}
