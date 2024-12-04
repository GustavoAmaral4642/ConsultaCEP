package com.consulta.cep.service.mapper;

import com.consulta.cep.domain.Address;
import com.consulta.cep.service.model.AddressModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringBuilderToAddressModel {
    public static AddressModel map(String content) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(content.toString(), AddressModel.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
