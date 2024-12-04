package com.consulta.cep.service;

import com.consulta.cep.domain.Address;
import com.consulta.cep.domain.Client;
import com.consulta.cep.service.model.AddressModel;

import java.util.List;

public interface AddressService {

    AddressModel getCep(String id);

    void save(Address client);

    void update(Address client);

    void delete(Long id);
}
