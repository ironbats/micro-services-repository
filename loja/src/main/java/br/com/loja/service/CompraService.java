package br.com.loja.service;

import br.com.loja.dto.CompraDTO;
import br.com.loja.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient eurekaClient;



    public void realizaCompra(CompraDTO compraDTO) {

        String estado = compraDTO.getEndereco().getEstado();
        ResponseEntity<InfoFornecedorDTO> exchange = restTemplate.
                exchange("http://fornecedor/info/" + estado,
                        HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(exchange.getBody());

        //to verify how many instances you have 
        eurekaClient.getInstances("fornecedor").forEach(si -> {

            System.out.println("Host : "+si.getHost() +" Port: "+ si.getPort() + " Instance Id "+ si.getInstanceId());
        });

    }
}
