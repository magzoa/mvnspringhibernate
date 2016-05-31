package py.edu.facitec.mvnspringhibernate.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.mvnspringhibernate.dao.ProductoDAO;

@RestController
@Transactional

@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private ProductoDAO productoDAO;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView lista(){
									//direccion a especificar
	ModelAndView model=new ModelAndView("/productos/archivo");	
		
	model.addObject("productos", productoDAO.getLista());
		
	return model;	
	}
	
	
}
