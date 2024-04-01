package io.github.moisescaldas.estacionamento_parkshopping.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.moisescaldas.estacionamento_parkshopping.entity.RegistroEntrada;

@Repository
public interface RegistroEntradaRepository extends JpaRepository<RegistroEntrada, BigInteger> {
}
