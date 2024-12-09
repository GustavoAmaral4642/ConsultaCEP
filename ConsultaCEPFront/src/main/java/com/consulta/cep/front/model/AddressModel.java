package com.consulta.cep.front.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.springframework.context.annotation.Lazy;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressModel {

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @JsonBackReference
    private ClientModel client;
}