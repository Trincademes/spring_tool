package com.br.Pedro.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Pedro.Entities.Clientes;
import com.br.Pedro.Repositories.clienteRepository;


@Service
public class clienteService {

private final clienteRepository clienteRepository;
@Autowired
public clienteService (clienteRepository clienteRepository) {
	this.clienteRepository = clienteRepository;
}

public Clientes saveclieente(Clientes cliente) {
	return clienteRepository.save(cliente);
	
}
public Clientes getClienteByIdc(Long idc) {
	return clienteRepository.findById(idc).orElse(null);
}
public List<Clientes> getAllcliente(){
	return clienteRepository.findAll();
}
public void deletecliente(Long idc) {
	clienteRepository.deleteById(idc);
}


}
