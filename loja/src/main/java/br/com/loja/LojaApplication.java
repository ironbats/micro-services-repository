package br.com.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(value = {"br.com.loja.controller",
        "br.com.loja.service"})
public class LojaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaApplication.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }

}
