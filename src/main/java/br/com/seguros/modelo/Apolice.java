package br.com.seguros.modelo;

import br.com.seguros.dto.ApoliceDTO;
import br.com.seguros.dto.Status;
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
    private Status ststus;
    @ManyToOne
    @JoinColumn(name = "id_apolice")
    private Cliente clientes;
    @OneToOne
    private Veiculo veiculos;

    public Apolice(ApoliceDTO apoliceDTO) {
        this.id = apoliceDTO.id();
        this.numero = apoliceDTO.numero();
        this.danosMateriais = apoliceDTO.danosMateriais();
        this.danosCorporais = apoliceDTO.danosCorporais();
        this.vidros = apoliceDTO.vidros();
        this.coberturaMenores = apoliceDTO.coberturaMenores();
        this.franquia = apoliceDTO.franquia();
        this.valorSeguro = apoliceDTO.valorSeguro();
        this.ststus = apoliceDTO.status();
        this.clientes = apoliceDTO.cliente();
        this.veiculos = apoliceDTO.veiculo();
    }
}
