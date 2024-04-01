package io.github.moisescaldas.estacionamento_parkshopping.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "registro_entrada")
public class RegistroEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private Long idRegistro;
 
    @Column(name = "placa")
    @Size(max = 10)
    private String placa;
 
    @Column(name = "data_hora_entrada")
    private LocalDateTime dataHoraEntrada;
 
    @Column(name = "data_hora_saida")
    private LocalDateTime dataHoraSaida;
 
    @Column(name = "valor_total")
    @Min(0)
    private BigDecimal valor;
 
    @Column(name = "pagamento_realizado")
    private Boolean pagamentoRealizado;
}
