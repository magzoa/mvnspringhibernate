package py.edu.facitec.mvnspringhibernate.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.mvnspringhibernate.dao.ClienteDAO;
import py.edu.facitec.mvnspringhibernate.model.Cliente;

@Transactional
@Controller
public class ClienteController {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	@RequestMapping("/clientes")
	public String save(Cliente cliente){
		
		System.out.println(cliente.toString());
		
		clienteDAO.save(cliente);
		
		return "/clientes/ok";
	}
	
	@RequestMapping("/clientes/formulario")
	public String formulario(){
		
		return "/clientes/formulario";
	}
	
	

}
