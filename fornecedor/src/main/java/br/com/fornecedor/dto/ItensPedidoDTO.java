package br.com.fornecedor.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class ItensPedidoDTO {

    private Long id;
    private String codigoProduto;
    private Integer quantidadeProduto;
    private String descricaoProduto;

}
