package com.consulta.cep.controller;

import com.consulta.cep.service.AddressService;
import com.consulta.cep.service.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{cep}")
    public ResponseEntity<AddressModel> getFindCep(@PathVariable String cep){
        return new ResponseEntity<>(addressService.getCep(cep), HttpStatus.OK);
    }
}
