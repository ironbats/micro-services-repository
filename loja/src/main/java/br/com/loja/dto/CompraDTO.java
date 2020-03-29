package br.com.loja.dto;

import java.util.List;

public class CompraDTO {

    private List<ItemCompra> itemCompras;
    private Endereco endereco;


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setItemCompras(List<ItemCompra> itemCompras) {
        this.itemCompras = itemCompras;
    }

    public List<ItemCompra> getItemCompras() {
        return itemCompras;
    }
}
