package br.com.seguros.modelo;

import br.com.seguros.dto.ClienteDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NotBlank
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String telefone;
    private String email;
    @OneToMany(mappedBy = "clientes",cascade = CascadeType.ALL)
    private List<Veiculo>veiculos = new ArrayList<>();

    public Cliente(ClienteDTO clienteDTO) {
        this.id = clienteDTO.id();
        this.nome = clienteDTO.nome();
        this.telefone = clienteDTO.telefone();
        this.email = clienteDTO.email();
        this.veiculos = clienteDTO.veiculos();
    }
}
