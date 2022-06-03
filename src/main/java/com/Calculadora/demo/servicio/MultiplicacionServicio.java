package com.Calculadora.demo.servicio;

import com.Calculadora.demo.compartida.MultiplicacionInput;
import com.Calculadora.demo.modelo.Multiplicacion;
import com.Calculadora.demo.repositorio.MultiplicacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class MultiplicacionServicio {
    @Autowired
    private MultiplicacionRepositorio multiplicacionRepositorio;

    public void enviarResultado(MultiplicacionInput multiplicacionInput) {
        BigInteger resultado = multiplicacionInput.getN1().multiply(multiplicacionInput.getN2());
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.setResultado(resultado.toString());
        multiplicacionRepositorio.save(multiplicacion);
    }
}
