package com.exercicio2.questao2.repository;

import com.exercicio2.questao2.entities.Pedido;

public class PedidoRepository {

    public Pedido salvar(Pedido pedido) {
        System.out.println("Pedido salvo");
        return pedido;
    }
}

