package com.consulta.cep.service.mapper;

import com.consulta.cep.service.model.AddressModel;
import com.consulta.cep.domain.Address;

public class AddressToAddressModel {
    public static AddressModel mapAddress(Address address) {
        return AddressModel.builder()
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
