package br.com.seguros.dto;

import br.com.seguros.modelo.Cliente;

import java.util.UUID;

public record VeiculoDTO(UUID id, String marca, String modelo, int anoModelo, String placa, Cliente clientes) {
}
