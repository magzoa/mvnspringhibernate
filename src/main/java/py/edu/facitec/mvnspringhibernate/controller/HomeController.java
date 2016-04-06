package py.edu.facitec.mvnspringhibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String index(){
		
		System.out.println("Iniciando página de Bienvenida");
		
		return "hello-world";
	}
	

}
