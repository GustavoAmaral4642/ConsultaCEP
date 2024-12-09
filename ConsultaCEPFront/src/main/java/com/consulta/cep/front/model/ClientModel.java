package com.consulta.cep.front.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {

    private Long id;
    private String name;

    @JsonManagedReference
    private List<AddressModel> addresses = new ArrayList<>();
}
