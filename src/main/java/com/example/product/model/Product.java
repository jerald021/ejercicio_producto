package com.example.product.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @NotNull
    @NotEmpty(message = "Name of the product cannot be empty")
    private String name;

    @Digits(integer = 4, fraction = 0)
    @NotNull
    private int quantity;

    @ManyToOne()
    @JoinColumn(name = "id_department", nullable = false)
    @NotNull
    private Department department;
}