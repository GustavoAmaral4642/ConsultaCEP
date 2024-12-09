package com.consulta.cep.service.impl;

import com.consulta.cep.domain.Address;
import com.consulta.cep.integration.FindCepImpl;
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

    @Autowired
    private FindCepImpl findCep;

    @Override
    public AddressModel getCep(String cep) {

        String cepFound = findCep.find(cep);
        SentMessageKafka.sent(cepFound);

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
