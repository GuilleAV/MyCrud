package com.codigowilli.mycrud.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Table(name="products")
@Data
public class Product {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="code")
    private Long code;

    @Column(name="barcode")
    private String barcode;


    @Column(name="description")
    private String description;


}
