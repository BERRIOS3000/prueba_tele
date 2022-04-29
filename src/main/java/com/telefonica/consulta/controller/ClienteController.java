package com.telefonica.consulta.controller;

import java.util.List;

import com.telefonica.consulta.dto.Response;
import com.telefonica.consulta.entity.Cliente;
import com.telefonica.consulta.entity.LineaMovil;
import com.telefonica.consulta.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {
    @Autowired
	ClienteService clienteService;
    
	@GetMapping("/users")
	public Response<List<LineaMovil>> clientesByNmroAndTipoDocumento(@RequestParam("tipoDocumento")String tipoDocumento,@RequestParam("numeroDocumento")String numeroDocumento){
		
		HttpStatus status=null;
		List<LineaMovil> list=null;
		String message=null;
		try {
			list=clienteService.getAllLineasMovilesByDocumentOfClient(tipoDocumento,numeroDocumento);
			status=HttpStatus.OK;
		}catch(Exception e) {
			list=null;
			status=HttpStatus.INTERNAL_SERVER_ERROR;
			message="An Exception ocurred trying to find Users"+e.getMessage();
		}
		return new Response<List<LineaMovil>>(status, message, list);	
	}
    
}
