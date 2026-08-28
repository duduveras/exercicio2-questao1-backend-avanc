package com.exercicio2.questao1.service;

import com.exercicio2.questao1.entities.Cliente;
import com.exercicio2.questao1.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrar(Cliente cliente) {

        if (cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new RuntimeException("Nome obrigatório");
        }

        if (clienteRepository.existsByEmail(cliente.getEmail())) {
            throw new RuntimeException("Email já cadastrado");
        }

        cliente.setAtivo(true);
        cliente.setDataCadastro(LocalDateTime.now());

        return clienteRepository.save(cliente);
    }
}
