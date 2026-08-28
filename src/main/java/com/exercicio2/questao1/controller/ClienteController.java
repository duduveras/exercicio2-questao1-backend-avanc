package com.exercicio2.questao1.controller;


import com.exercicio2.questao1.entities.Cliente;
import com.exercicio2.questao1.service.ClienteService;

public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public Cliente cadastrar(Cliente cliente) {
        return clienteService.cadastrar(cliente);
    }
}
