package br.com.seguros.dto;

import br.com.seguros.modelo.Cliente;
import br.com.seguros.modelo.Veiculo;

import java.util.List;
import java.util.UUID;

public record ClienteDTO(UUID id, String nome, String telefone, String email, List<Veiculo> veiculos) {

    public ClienteDTO(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getTelefone(), cliente.getEmail(), cliente.getVeiculos());
    }
}
