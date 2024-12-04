package com.consulta.cep.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @Column(name = "address_cep")
    private String cep;

    @Column(name = "address_logradouro")
    private String logradouro;

    @Column(name = "address_complemento")
    private String complemento;

    @Column(name = "address_unidade")
    private String unidade;

    @Column(name = "address_bairro")
    private String bairro;

    @Column(name = "address_localidade")
    private String localidade;

    @Column(name = "address_uf")
    private String uf;

    @Column(name = "address_estado")
    private String estado;

    @Column(name = "address_regiao")
    private String regiao;

    @Column(name = "address_ibge")
    private String ibge;

    @Column(name = "address_gia")
    private String gia;

    @Column(name = "address_ddd")
    private String ddd;

    @Column(name = "address_siafi")
    private String siafi;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
