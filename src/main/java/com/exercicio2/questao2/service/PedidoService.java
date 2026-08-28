package com.exercicio2.questao2.service;

import com.exercicio2.questao2.entities.Pedido;
import com.exercicio2.questao2.repository.PedidoRepository;

public class PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido criarPedido(Pedido pedido) {

        validarCliente();
        calcularTotal();
        atualizarEstoque();

        pedido.setStatus("CRIADO");

        return pedidoRepository.salvar(pedido);
    }

    private void validarCliente() {
        System.out.println("Validando cliente");
    }

    private void calcularTotal() {
        System.out.println("Calculando total");
    }

    private void atualizarEstoque() {
        System.out.println("Atualizando estoque");
    }
}

