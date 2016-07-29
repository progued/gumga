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
}
