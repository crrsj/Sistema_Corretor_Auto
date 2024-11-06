package br.com.seguros.repositorio;

import br.com.seguros.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepositorio extends JpaRepository<Cliente, UUID> {
}
