package br.com.loja.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class InfoPedidoDTO {

    private Long id;
    private Integer tempoPreparo;

}
