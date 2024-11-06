package br.com.seguros.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NotBlank
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String marca;
    private String modelo;
    private int anoModelo;
    @Size(min = 7,max = 7)
    private String placa;
    @ManyToOne
    @JoinColumn(name = "Id_cliente")
    private Cliente clientes;
}
