package br.com.db1.bean;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class Resultado {

	private String complexidade;
	private Integer nota;
	
	private Integer numeroDeCaracteres;
	private Integer letrasMaiusculas;
	private Integer letrasMinusculas;
	private Integer numeros;
	private Integer simbolos;
	private Integer numerosDoMeioOuSimbolos;
	private Integer requisitos;
	private Integer apenasLetras;
	private Integer apenasNumeros;
	private Integer caracteresRepetidos;
	private Integer letrasMaiusculasConsecutivas;
	private Integer letrasMinusculasConsecutivas;
	private Integer numerosConsecutivos;
	private Integer tresOuMaisLetrasSequenciais;
	private Integer tresOuMaisNumerosSequenciais;
	private Integer tresOuMaisSimbolosSequenciais;

	private Integer pontuacaoNumeroDeCaracteres;
	private Integer pontuacaoLetrasMaiusculas;
	private Integer pontuacaoLetrasMinusculas;
	private Integer pontuacaoNumeros;
	private Integer pontuacaoSimbolos;
	private Integer pontuacaoNumerosDoMeioOuSimbolos;
	private Integer pontuacaoRequisitos;
	private Integer pontuacaoApenasLetras;
	private Integer pontuacaoApenasNumeros;
	private Integer pontuacaoCaracteresRepetidos;
	private Integer pontuacaoLetrasMaiusculasConsecutivas;
	private Integer pontuacaoLetrasMinusculasConsecutivas;
	private Integer pontuacaoNumerosConsecutivos;
	private Integer pontuacaoTresOuMaisLetrasSequenciais;
	private Integer pontuacaoTresOuMaisNumerosSequenciais;
	private Integer pontuacaoTresOuMaisSimbolosSequenciais;
	
	public String getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(String complexidade) {
		this.complexidade = complexidade;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	public Integer getNumeroDeCaracteres() {
		return numeroDeCaracteres;
	}
	public void setNumeroDeCaracteres(Integer numeroDeCaracteres) {
		this.numeroDeCaracteres = numeroDeCaracteres;
	}
	public Integer getLetrasMaiusculas() {
		return letrasMaiusculas;
	}
	public void setLetrasMaiusculas(Integer letrasMaiusculas) {
		this.letrasMaiusculas = letrasMaiusculas;
	}
	public Integer getLetrasMinusculas() {
		return letrasMinusculas;
	}
	public void setLetrasMinusculas(Integer letrasMinusculas) {
		this.letrasMinusculas = letrasMinusculas;
	}
	public Integer getNumeros() {
		return numeros;
	}
	public void setNumeros(Integer numeros) {
		this.numeros = numeros;
	}
	public Integer getSimbolos() {
		return simbolos;
	}
	public void setSimbolos(Integer simbolos) {
		this.simbolos = simbolos;
	}
	public Integer getNumerosDoMeioOuSimbolos() {
		return numerosDoMeioOuSimbolos;
	}
	public void setNumerosDoMeioOuSimbolos(Integer numerosDoMeioOuSimbolos) {
		this.numerosDoMeioOuSimbolos = numerosDoMeioOuSimbolos;
	}
	public Integer getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(Integer requisitos) {
		this.requisitos = requisitos;
	}
	public Integer getApenasLetras() {
		return apenasLetras;
	}
	public void setApenasLetras(Integer apenasLetras) {
		this.apenasLetras = apenasLetras;
	}
	public Integer getApenasNumeros() {
		return apenasNumeros;
	}
	public void setApenasNumeros(Integer apenasNumeros) {
		this.apenasNumeros = apenasNumeros;
	}
	public Integer getCaracteresRepetidos() {
		return caracteresRepetidos;
	}
	public void setCaracteresRepetidos(Integer caracteresRepetidos) {
		this.caracteresRepetidos = caracteresRepetidos;
	}
	public Integer getLetrasMaiusculasConsecutivas() {
		return letrasMaiusculasConsecutivas;
	}
	public void setLetrasMaiusculasConsecutivas(Integer letrasMaiusculasConsecutivas) {
		this.letrasMaiusculasConsecutivas = letrasMaiusculasConsecutivas;
	}
	public Integer getLetrasMinusculasConsecutivas() {
		return letrasMinusculasConsecutivas;
	}
	public void setLetrasMinusculasConsecutivas(Integer letrasMinusculasConsecutivas) {
		this.letrasMinusculasConsecutivas = letrasMinusculasConsecutivas;
	}
	public Integer getNumerosConsecutivos() {
		return numerosConsecutivos;
	}
	public void setNumerosConsecutivos(Integer numerosConsecutivos) {
		this.numerosConsecutivos = numerosConsecutivos;
	}
	public Integer getTresOuMaisLetrasSequenciais() {
		return tresOuMaisLetrasSequenciais;
	}
	public void setTresOuMaisLetrasSequenciais(Integer tresOuMaisLetrasSequenciais) {
		this.tresOuMaisLetrasSequenciais = tresOuMaisLetrasSequenciais;
	}
	public Integer getTresOuMaisNumerosSequenciais() {
		return tresOuMaisNumerosSequenciais;
	}
	public void setTresOuMaisNumerosSequenciais(Integer tresOuMaisNumerosSequenciais) {
		this.tresOuMaisNumerosSequenciais = tresOuMaisNumerosSequenciais;
	}
	public Integer getTresOuMaisSimbolosSequenciais() {
		return tresOuMaisSimbolosSequenciais;
	}
	public void setTresOuMaisSimbolosSequenciais(
			Integer tresOuMaisSimbolosSequenciais) {
		this.tresOuMaisSimbolosSequenciais = tresOuMaisSimbolosSequenciais;
	}
	public Integer getPontuacaoNumeroDeCaracteres() {
		return pontuacaoNumeroDeCaracteres;
	}
	public void setPontuacaoNumeroDeCaracteres(Integer pontuacaoNumeroDeCaracteres) {
		this.pontuacaoNumeroDeCaracteres = pontuacaoNumeroDeCaracteres;
	}
	public Integer getPontuacaoLetrasMaiusculas() {
		return pontuacaoLetrasMaiusculas;
	}
	public void setPontuacaoLetrasMaiusculas(Integer pontuacaoLetrasMaiusculas) {
		this.pontuacaoLetrasMaiusculas = pontuacaoLetrasMaiusculas;
	}
	public Integer getPontuacaoLetrasMinusculas() {
		return pontuacaoLetrasMinusculas;
	}
	public void setPontuacaoLetrasMinusculas(Integer pontuacaoLetrasMinusculas) {
		this.pontuacaoLetrasMinusculas = pontuacaoLetrasMinusculas;
	}
	public Integer getPontuacaoNumeros() {
		return pontuacaoNumeros;
	}
	public void setPontuacaoNumeros(Integer pontuacaoNumeros) {
		this.pontuacaoNumeros = pontuacaoNumeros;
	}
	public Integer getPontuacaoSimbolos() {
		return pontuacaoSimbolos;
	}
	public void setPontuacaoSimbolos(Integer pontuacaoSimbolos) {
		this.pontuacaoSimbolos = pontuacaoSimbolos;
	}
	public Integer getPontuacaoNumerosDoMeioOuSimbolos() {
		return pontuacaoNumerosDoMeioOuSimbolos;
	}
	public void setPontuacaoNumerosDoMeioOuSimbolos(
			Integer pontuacaoNumerosDoMeioOuSimbolos) {
		this.pontuacaoNumerosDoMeioOuSimbolos = pontuacaoNumerosDoMeioOuSimbolos;
	}
	public Integer getPontuacaoRequisitos() {
		return pontuacaoRequisitos;
	}
	public void setPontuacaoRequisitos(Integer pontuacaoRequisitos) {
		this.pontuacaoRequisitos = pontuacaoRequisitos;
	}
	public Integer getPontuacaoApenasLetras() {
		return pontuacaoApenasLetras;
	}
	public void setPontuacaoApenasLetras(Integer pontuacaoApenasLetras) {
		this.pontuacaoApenasLetras = pontuacaoApenasLetras;
	}
	public Integer getPontuacaoApenasNumeros() {
		return pontuacaoApenasNumeros;
	}
	public void setPontuacaoApenasNumeros(Integer pontuacaoApenasNumeros) {
		this.pontuacaoApenasNumeros = pontuacaoApenasNumeros;
	}
	public Integer getPontuacaoCaracteresRepetidos() {
		return pontuacaoCaracteresRepetidos;
	}
	public void setPontuacaoCaracteresRepetidos(Integer pontuacaoCaracteresRepetidos) {
		this.pontuacaoCaracteresRepetidos = pontuacaoCaracteresRepetidos;
	}
	public Integer getPontuacaoLetrasMaiusculasConsecutivas() {
		return pontuacaoLetrasMaiusculasConsecutivas;
	}
	public void setPontuacaoLetrasMaiusculasConsecutivas(
			Integer pontuacaoLetrasMaiusculasConsecutivas) {
		this.pontuacaoLetrasMaiusculasConsecutivas = pontuacaoLetrasMaiusculasConsecutivas;
	}
	public Integer getPontuacaoLetrasMinusculasConsecutivas() {
		return pontuacaoLetrasMinusculasConsecutivas;
	}
	public void setPontuacaoLetrasMinusculasConsecutivas(
			Integer pontuacaoLetrasMinusculasConsecutivas) {
		this.pontuacaoLetrasMinusculasConsecutivas = pontuacaoLetrasMinusculasConsecutivas;
	}
	public Integer getPontuacaoNumerosConsecutivos() {
		return pontuacaoNumerosConsecutivos;
	}
	public void setPontuacaoNumerosConsecutivos(Integer pontuacaoNumerosConsecutivos) {
		this.pontuacaoNumerosConsecutivos = pontuacaoNumerosConsecutivos;
	}
	public Integer getPontuacaoTresOuMaisLetrasSequenciais() {
		return pontuacaoTresOuMaisLetrasSequenciais;
	}
	public void setPontuacaoTresOuMaisLetrasSequenciais(
			Integer pontuacaoTresOuMaisLetrasSequenciais) {
		this.pontuacaoTresOuMaisLetrasSequenciais = pontuacaoTresOuMaisLetrasSequenciais;
	}
	public Integer getPontuacaoTresOuMaisNumerosSequenciais() {
		return pontuacaoTresOuMaisNumerosSequenciais;
	}
	public void setPontuacaoTresOuMaisNumerosSequenciais(
			Integer pontuacaoTresOuMaisNumerosSequenciais) {
		this.pontuacaoTresOuMaisNumerosSequenciais = pontuacaoTresOuMaisNumerosSequenciais;
	}
	public Integer getPontuacaoTresOuMaisSimbolosSequenciais() {
		return pontuacaoTresOuMaisSimbolosSequenciais;
	}
	public void setPontuacaoTresOuMaisSimbolosSequenciais(
			Integer pontuacaoTresOuMaisSimbolosSequenciais) {
		this.pontuacaoTresOuMaisSimbolosSequenciais = pontuacaoTresOuMaisSimbolosSequenciais;
	}

}
