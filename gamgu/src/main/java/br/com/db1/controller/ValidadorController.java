package br.com.db1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.bean.Resultado;
import br.com.db1.util.Validador;

@RestController
public class ValidadorController {
	   
		@ResponseBody
		@RequestMapping(value="/validador", method=RequestMethod.POST, produces = "application/json")
	    public Resultado validaSenha( @RequestParam(value = "senha", required = false, defaultValue = "") String senha) {
			return new Validador().validaSenha(senha);
	    }
}
