package com.Calculadora.demo.compartida;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

public class MultiplicacionInput {
    @Getter @Setter
    private BigInteger n1;
    @Getter @Setter
    private BigInteger n2;

    public MultiplicacionInput(BigInteger n1, BigInteger n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
}
