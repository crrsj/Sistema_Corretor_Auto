package br.com.seguros.dto;

import br.com.seguros.enums.Vidros;
import br.com.seguros.modelo.Cliente;
import br.com.seguros.modelo.CoberturaMenores;
import br.com.seguros.modelo.Veiculo;

import java.math.BigDecimal;
import java.util.UUID;

public record ApoliceDTO(
        UUID id, int numero,
        Integer danosMateriais,
        Integer danosCorporais,
        Vidros vidros,
        CoberturaMenores coberturaMenores,
        BigDecimal franquia,
        BigDecimal valorSeguro,
        Status status,
        Cliente cliente,
        Veiculo veiculo) {
}
