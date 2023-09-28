package com.ciberfarma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class proyectoController {
	//crear acciones o controlador
	//1 determinar el tipo o forma de acceso
	// href -> método get || form/method post -> método post
	@GetMapping("/cargaLogin")
	public String abrirPagLogin() {
		return "login"; //página o recurso a redireccionar
	}
}	
