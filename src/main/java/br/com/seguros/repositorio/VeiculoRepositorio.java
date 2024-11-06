package br.com.seguros.repositorio;

import br.com.seguros.modelo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VeiculoRepositorio extends JpaRepository<Veiculo, UUID> {
}
