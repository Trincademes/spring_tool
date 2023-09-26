package com.br.Pedro.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.br.Pedro.Entities.Clientes;

public interface clienteRepository extends JpaRepository<Clientes, Long>{
	
}

	

