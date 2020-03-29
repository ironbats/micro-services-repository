package br.com.loja.dto;

public class ItemCompra {

    private Long id;
    private Integer quantidade;


    public void setId(Long id) {
        this.id = id;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
