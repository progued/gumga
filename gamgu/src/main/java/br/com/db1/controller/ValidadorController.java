package br.com.db1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.bean.Resultado;
import br.com.db1.util.Validador;

@RestController
public class ValidadorController {
	   
		@ResponseBody
		@RequestMapping(value="/validador")
	    public Resultado hello( @RequestParam(value = "senha", required = false, defaultValue = "") String senha) {
	        return Validador.validaSenha(senha);
	    }
}
