package com.Calculadora.demo.repositorio;

import com.Calculadora.demo.modelo.Multiplicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultiplicacionRepositorio extends JpaRepository<Multiplicacion, Integer> {
}
