package com.consulta.cep.service.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ClientModel {

    private Long id;
    private String name;
    private List<AddressModel> addresses;
}
