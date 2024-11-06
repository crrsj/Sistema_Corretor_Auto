package br.com.seguros.servico;

import br.com.seguros.dto.ApoliceDTO;
import br.com.seguros.dto.ClienteDTO;
import br.com.seguros.dto.VeiculoDTO;
import br.com.seguros.modelo.Apolice;
import br.com.seguros.modelo.Cliente;
import br.com.seguros.modelo.Veiculo;
import br.com.seguros.repositorio.ApoliceRepositorio;
import br.com.seguros.repositorio.ClienteRepositorio;
import br.com.seguros.repositorio.VeiculoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SeguroServico {

    private final ClienteRepositorio clienteRepositorio;
    private final VeiculoRepositorio veiculoRepositorio;
    private final ApoliceRepositorio apoliceRepositorio;

    public Cliente cadastrarCliente(ClienteDTO clienteDTO){
        var cadastrar = new Cliente(clienteDTO);
        return clienteRepositorio.save(cadastrar);

    }
    public Veiculo cadastrarVeiculo(VeiculoDTO veiculoDTO,UUID clienteId){
        var novoVeiculo = new Veiculo(veiculoDTO);
        var cliente = clienteRepositorio.findById(clienteId).get();
        novoVeiculo.setClientes(cliente);
        return veiculoRepositorio.save(novoVeiculo);

    }
    public Apolice cadastrarApolice(ApoliceDTO apoliceDTO,UUID clienteId){
       var novaApolice = new Apolice(apoliceDTO);
        var cliente = clienteRepositorio.findById(clienteId).get();
        novaApolice.setClientes(cliente);
        return  apoliceRepositorio.save(novaApolice);
    }
    public List<ClienteDTO>listarClientes(){
        var lista = clienteRepositorio.findAll().stream().map(ClienteDTO::new).toList();
        return lista;
    }

}
