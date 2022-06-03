package com.Calculadora.demo.modelo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Multiplicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String resultado;



}
