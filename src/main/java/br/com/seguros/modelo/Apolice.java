package br.com.seguros.modelo;

import br.com.seguros.enums.Vidros;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

@Entity
@Table(name = "apolices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apolice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private int numero = new Random().nextInt(1000 + 1);
    private Integer danosMateriais;
    private Integer danosCorporais;
    private Vidros vidros;
    private CoberturaMenores coberturaMenores;
    private BigDecimal franquia;
    private BigDecimal valorSeguro;
    @ManyToOne
    @JoinColumn(name = "id_apolice")
    private Cliente cliente;
    @OneToOne
    private Veiculo veiculo;
}
