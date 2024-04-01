package io.github.moisescaldas.estacionamento_parkshopping.dto.response;

import java.math.BigInteger;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RegistroDTO {
    private BigInteger idRegistro;
    private String placa;
    private LocalDateTime dataHoraEntrada;
}
