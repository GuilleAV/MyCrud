package com.codigowilli.mycrud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductDTO {

    @JsonProperty("Codigo de Barra")
    private String barcode;

    @JsonProperty("Descripcion")
    private String description;

}
