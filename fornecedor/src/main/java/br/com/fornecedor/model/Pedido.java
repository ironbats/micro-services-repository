package br.com.fornecedor.model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigoPedido;
    private Double totalPedido;

    @ElementCollection(targetClass = Produto.class)
    @Column(name="products")
    private List<Produto> produto;

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    //muitos pedidos para um fornecedores
    //ou seja um pedido so pode ter um forncedor por ordem
    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private InfoFornecedor infoFornecedor;

    public void setInfoFornecedor(InfoFornecedor infoFornecedor) {
        this.infoFornecedor = infoFornecedor;
    }

    public InfoFornecedor getInfoFornecedor() {
        return infoFornecedor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }



    public Long getId() {
        return id;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }
}
