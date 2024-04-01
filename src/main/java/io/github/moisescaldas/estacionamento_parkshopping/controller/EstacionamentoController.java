package io.github.moisescaldas.estacionamento_parkshopping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.moisescaldas.estacionamento_parkshopping.dto.request.CheckInDTO;
import io.github.moisescaldas.estacionamento_parkshopping.dto.response.RegistroDTO;
import io.github.moisescaldas.estacionamento_parkshopping.service.RegistroEntradaService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/v1/estacionamento")
@AllArgsConstructor
public class EstacionamentoController {

    private RegistroEntradaService registroEntradaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegistroDTO> postMethodName(@RequestBody CheckInDTO checkIn) {        
        var response = registroEntradaService.checkInCarro(checkIn.getPlaca());
        
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
}
