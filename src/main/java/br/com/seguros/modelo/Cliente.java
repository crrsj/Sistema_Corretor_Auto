package br.com.seguros.modelo;

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
    private String telefone;
    private String Email;
    @OneToMany(mappedBy = "clientes",cascade = CascadeType.ALL)
    private List<Veiculo>veiculos = new ArrayList<>();

}
