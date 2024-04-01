package io.github.moisescaldas.estacionamento_parkshopping.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import io.github.moisescaldas.estacionamento_parkshopping.dto.response.RegistroDTO;
import io.github.moisescaldas.estacionamento_parkshopping.entity.RegistroEntrada;
import io.github.moisescaldas.estacionamento_parkshopping.repository.RegistroEntradaRepository;
import io.github.moisescaldas.estacionamento_parkshopping.utils.ModelMapperUtil;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistroEntradaService {
    private RegistroEntradaRepository registroEntradaRepository;

    public RegistroDTO checkInCarro(String placa) {
        var registro = new RegistroEntrada();
        registro.setPlaca(placa);
        registro.setDataHoraEntrada(LocalDateTime.now());
        registro = registroEntradaRepository.save(registro);

        return ModelMapperUtil.convert(registro, RegistroDTO.class);
    }
}
