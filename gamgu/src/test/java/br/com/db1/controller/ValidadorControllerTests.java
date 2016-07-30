package br.com.db1.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.com.db1.AbstractContextControllerTests;

@RunWith(SpringJUnit4ClassRunner.class)
public class ValidadorControllerTests  extends AbstractContextControllerTests {

	private MockMvc mockMvc;
	
	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
	}

	@Test
	public void senha_1() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "1"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":3,\"numeroDeCaracteres\":1,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":1,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":1,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":4,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":1,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_12() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "12"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":4,\"numeroDeCaracteres\":2,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":2,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":2,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":1,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":8,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":2,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":2,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	
	@Test
	public void senha_123() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "123"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":4,\"numeroDeCaracteres\":3,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":3,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":1,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":3,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":2,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":1,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":12,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":2,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":3,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":4,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":3,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_965() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "965"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":7,\"numeroDeCaracteres\":3,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":3,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":1,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":3,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":2,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":12,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":2,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":3,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":4,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	
	@Test
	public void senha_12333() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "12333"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":4,\"numeroDeCaracteres\":5,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":5,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":3,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":5,\"caracteresRepetidos\":3,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":4,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":1,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":20,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":6,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":5,\"pontuacaoCaracteresRepetidos\":6,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":8,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":3,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_a() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "a"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":3,\"numeroDeCaracteres\":1,\"letrasMaiusculas\":0,\"letrasMinusculas\":1,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":1,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":4,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":1,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_ab() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "ab"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":4,\"numeroDeCaracteres\":2,\"letrasMaiusculas\":0,\"letrasMinusculas\":2,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":2,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":1,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":8,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":2,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":2,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_abc() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "abc"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":2,\"numeroDeCaracteres\":3,\"letrasMaiusculas\":0,\"letrasMinusculas\":3,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":3,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":2,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":1,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":12,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":3,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":4,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":3,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	
	@Test
	public void senha_abccc() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "abccc"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":0,\"numeroDeCaracteres\":5,\"letrasMaiusculas\":0,\"letrasMinusculas\":5,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":5,\"apenasNumeros\":0,\"caracteresRepetidos\":3,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":4,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":1,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":20,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":5,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":6,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":8,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":3,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_kiw() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "kiw"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":5,\"numeroDeCaracteres\":3,\"letrasMaiusculas\":0,\"letrasMinusculas\":3,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":3,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":2,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":12,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":3,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":4,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_W() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "W"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":3,\"numeroDeCaracteres\":1,\"letrasMaiusculas\":1,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":1,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":4,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":1,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	@Test
	public void senha_WF() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "WF"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":4,\"numeroDeCaracteres\":2,\"letrasMaiusculas\":2,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":2,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":1,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":8,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":2,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":2,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	@Test
	public void senha_WFA() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "WFA"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":5,\"numeroDeCaracteres\":3,\"letrasMaiusculas\":3,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":3,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":2,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":12,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":3,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":4,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	@Test
	public void senha_WFAAA() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "WFAAA"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":1,\"numeroDeCaracteres\":5,\"letrasMaiusculas\":5,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":5,\"apenasNumeros\":0,\"caracteresRepetidos\":3,\"letrasMaiusculasConsecutivas\":4,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":20,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":5,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":6,\"pontuacaoLetrasMaiusculasConsecutivas\":8,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha__() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "@"))
				.andExpect(content().string("{\"complexidade\":\"Muito fraca\",\"nota\":10,\"numeroDeCaracteres\":1,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":1,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":4,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":6,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	
	@Test
	public void senha___() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "@#"))
				.andExpect(content().string("{\"complexidade\":\"Fraca\",\"nota\":20,\"numeroDeCaracteres\":2,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":2,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":8,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":12,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	
	@Test
	public void senha____() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "@#$"))
				.andExpect(content().string("{\"complexidade\":\"Fraca\",\"nota\":29,\"numeroDeCaracteres\":3,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":3,\"numerosDoMeioOuSimbolos\":1,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":1,\"pontuacaoNumeroDeCaracteres\":12,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":18,\"pontuacaoNumerosDoMeioOuSimbolos\":2,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
	
	@Test
	public void senha_____() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "@#$$$"))
				.andExpect(content().string("{\"complexidade\":\"Boa\",\"nota\":47,\"numeroDeCaracteres\":5,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":5,\"numerosDoMeioOuSimbolos\":3,\"requisitos\":1,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":3,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":1,\"pontuacaoNumeroDeCaracteres\":20,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":30,\"pontuacaoNumerosDoMeioOuSimbolos\":6,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":6,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha______() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "@#12asMds43"))
				.andExpect(content().string("{\"complexidade\":\"Muito forte\",\"nota\":100,\"numeroDeCaracteres\":11,\"letrasMaiusculas\":1,\"letrasMinusculas\":4,\"numeros\":4,\"simbolos\":2,\"numerosDoMeioOuSimbolos\":4,\"requisitos\":5,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":2,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":2,\"numerosConsecutivos\":2,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":44,\"pontuacaoLetrasMaiusculas\":20,\"pontuacaoLetrasMinusculas\":14,\"pontuacaoNumeros\":16,\"pontuacaoSimbolos\":12,\"pontuacaoNumerosDoMeioOuSimbolos\":8,\"pontuacaoRequisitos\":10,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":1,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":4,\"pontuacaoNumerosConsecutivos\":4,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_______() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "$%Ws12"))
				.andExpect(content().string("{\"complexidade\":\"Forte\",\"nota\":66,\"numeroDeCaracteres\":6,\"letrasMaiusculas\":1,\"letrasMinusculas\":1,\"numeros\":2,\"simbolos\":2,\"numerosDoMeioOuSimbolos\":2,\"requisitos\":4,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":1,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":24,\"pontuacaoLetrasMaiusculas\":10,\"pontuacaoLetrasMinusculas\":10,\"pontuacaoNumeros\":8,\"pontuacaoSimbolos\":12,\"pontuacaoNumerosDoMeioOuSimbolos\":4,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":2,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha________() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", "DSew#@344444"))
				.andExpect(content().string("{\"complexidade\":\"Muito forte\",\"nota\":100,\"numeroDeCaracteres\":12,\"letrasMaiusculas\":2,\"letrasMinusculas\":2,\"numeros\":6,\"simbolos\":2,\"numerosDoMeioOuSimbolos\":7,\"requisitos\":5,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":5,\"letrasMaiusculasConsecutivas\":1,\"letrasMinusculasConsecutivas\":1,\"numerosConsecutivos\":5,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":48,\"pontuacaoLetrasMaiusculas\":20,\"pontuacaoLetrasMinusculas\":20,\"pontuacaoNumeros\":24,\"pontuacaoSimbolos\":12,\"pontuacaoNumerosDoMeioOuSimbolos\":14,\"pontuacaoRequisitos\":10,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":5,\"pontuacaoLetrasMaiusculasConsecutivas\":2,\"pontuacaoLetrasMinusculasConsecutivas\":2,\"pontuacaoNumerosConsecutivos\":10,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}

	@Test
	public void senha_________() throws Exception {
		this.mockMvc.perform(post("/validador")
                .param("senha", ""))
				.andExpect(content().string("{\"complexidade\":\"Muito curta\",\"nota\":0,\"numeroDeCaracteres\":0,\"letrasMaiusculas\":0,\"letrasMinusculas\":0,\"numeros\":0,\"simbolos\":0,\"numerosDoMeioOuSimbolos\":0,\"requisitos\":0,\"apenasLetras\":0,\"apenasNumeros\":0,\"caracteresRepetidos\":0,\"letrasMaiusculasConsecutivas\":0,\"letrasMinusculasConsecutivas\":0,\"numerosConsecutivos\":0,\"tresOuMaisLetrasSequenciais\":0,\"tresOuMaisNumerosSequenciais\":0,\"tresOuMaisSimbolosSequenciais\":0,\"pontuacaoNumeroDeCaracteres\":0,\"pontuacaoLetrasMaiusculas\":0,\"pontuacaoLetrasMinusculas\":0,\"pontuacaoNumeros\":0,\"pontuacaoSimbolos\":0,\"pontuacaoNumerosDoMeioOuSimbolos\":0,\"pontuacaoRequisitos\":0,\"pontuacaoApenasLetras\":0,\"pontuacaoApenasNumeros\":0,\"pontuacaoCaracteresRepetidos\":0,\"pontuacaoLetrasMaiusculasConsecutivas\":0,\"pontuacaoLetrasMinusculasConsecutivas\":0,\"pontuacaoNumerosConsecutivos\":0,\"pontuacaoTresOuMaisLetrasSequenciais\":0,\"pontuacaoTresOuMaisNumerosSequenciais\":0,\"pontuacaoTresOuMaisSimbolosSequenciais\":0}"));
	}
}
