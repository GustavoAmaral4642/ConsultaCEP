package com.consulta.cep.service.mapper;

import com.consulta.cep.service.model.AddressModel;
import com.consulta.cep.domain.Address;

public class AddressToAddressModel {
    public static AddressModel map(Address address) {
        return AddressModel.builder()
                .id(address.getId())
                .cep(address.getCep())
                .logradouro(address.getLogradouro())
                .complemento(address.getComplemento())
                .unidade(address.getUnidade())
                .bairro(address.getBairro())
                .localidade(address.getLocalidade())
                .uf(address.getUf())
                .estado(address.getEstado())
                .regiao(address.getRegiao())
                .ibge(address.getIbge())
                .gia(address.getGia())
                .ddd(address.getDdd())
                .siafi(address.getSiafi())
                .build();
    }

}
