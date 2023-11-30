package com.dianome.entregadores.repositorio;

import com.dianome.entregadores.modelo.Entregador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntregadorRepository extends JpaRepository<Entregador, String> {
}
