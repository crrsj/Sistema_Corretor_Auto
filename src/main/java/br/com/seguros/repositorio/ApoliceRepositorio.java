package br.com.seguros.repositorio;

import br.com.seguros.modelo.Apolice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApoliceRepositorio extends JpaRepository<Apolice, UUID> {
}
