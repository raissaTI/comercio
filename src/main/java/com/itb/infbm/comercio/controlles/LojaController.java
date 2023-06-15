package com.itb.infbm.comercio.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
@GetMapping("/listar")
public String listarProdutos() {
	System.out.println("Lista de produtos!");
	
	return "produtos"; //retorna o template //não precisa colocar o html, o arquivo da erro.
	
}
	
	
	
	
	
	

}
