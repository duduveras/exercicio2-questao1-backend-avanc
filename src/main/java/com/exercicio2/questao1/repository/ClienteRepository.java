package com.exercicio2.questao1.repository;

import com.exercicio2.questao1.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public class ClienteRepository {

        public boolean existsByEmail(String email) {
                return false;
        }

        public Cliente save(Cliente cliente) {
                return cliente;
        }
}
