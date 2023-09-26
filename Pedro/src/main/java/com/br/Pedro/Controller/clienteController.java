package com.br.Pedro.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.Pedro.Entities.Clientes;
import com.br.Pedro.Service.clienteService;


@RestController
@RequestMapping("/client")
public class clienteController {

@Autowired
private final clienteService clienteService;
public clienteController( clienteService clienteService ) {
	this. clienteService = clienteService;
}
@PostMapping
public Clientes createcliente(@RequestBody Clientes cliente) {
	return clienteService.saveclieente(cliente);
	
}
@GetMapping("/{idcCliente}")
public Clientes getcliente(@PathVariable Long idcCliente) {
	return clienteService.getClienteByIdc(idcCliente);
		
	}
@GetMapping
public List<Clientes> getAllcliente(){
	return clienteService.getAllcliente();
	
}
public void deletecliente(@PathVariable Long idcCliente) {
	clienteService.deletecliente(idcCliente);
}


}
