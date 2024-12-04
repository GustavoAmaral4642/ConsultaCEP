package com.consulta.cep.service.impl;

import com.consulta.cep.domain.Address;
import com.consulta.cep.integration.FindCep;
import com.consulta.cep.repository.AddressRepository;
import com.consulta.cep.service.AddressService;
import com.consulta.cep.service.mapper.StringBuilderToAddressModel;
import com.consulta.cep.service.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressModel getCep(String id) {

        String cepFound = FindCep.find(id.toString());
        SentMessageKafka.sent(cepFound.toString());

        return StringBuilderToAddressModel.map(cepFound);
    }

    @Override
    public void save(Address client) {

    }

    @Override
    public void update(Address client) {

    }

    @Override
    public void delete(Long id) {

    }
}
