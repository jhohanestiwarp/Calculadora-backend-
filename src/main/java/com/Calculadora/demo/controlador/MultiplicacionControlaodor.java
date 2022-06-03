package com.Calculadora.demo.controlador;

import com.Calculadora.demo.compartida.MultiplicacionInput;
import com.Calculadora.demo.modelo.Multiplicacion;
import com.Calculadora.demo.repositorio.MultiplicacionRepositorio;
import com.Calculadora.demo.servicio.MultiplicacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/calculadora")
@CrossOrigin(origins = "http://localhost:4200")
public class MultiplicacionControlaodor {
    @Autowired
    private MultiplicacionServicio multiplicacionServicio;
    @Autowired
    private MultiplicacionRepositorio multiplicacionRepositorio;


    @PostMapping
    public void enviarValores(@RequestBody MultiplicacionInput multiplicacionInput ){
         multiplicacionServicio.enviarResultado(multiplicacionInput);
    }


    @GetMapping
    public List<Multiplicacion> consultarResultado(){
        return multiplicacionRepositorio.findAll();
    }


    @DeleteMapping()
    public void eliminarValores(){
        multiplicacionRepositorio.deleteAll();
    }


}
