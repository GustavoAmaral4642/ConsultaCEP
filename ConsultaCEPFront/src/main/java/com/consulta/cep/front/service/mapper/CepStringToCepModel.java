package com.consulta.cep.front.service.mapper;

import com.consulta.cep.front.model.CepModel;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CepStringToCepModel {

    public static CepModel mapper(String cep) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            CepModel tt = objectMapper.readValue(cep, CepModel.class);
            return tt;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
