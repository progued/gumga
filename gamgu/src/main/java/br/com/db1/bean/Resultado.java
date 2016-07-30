package br.com.db1.bean;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class Resultado {

	private String complexidade;
	private int nota;
	
	private int numeroDeCaracteres;
	private int letrasMaiusculas;
	private int letrasMinusculas;
	private int numeros;
	private int simbolos;
	private int numerosDoMeioOuSimbolos;
	private int requisitos;
	private int apenasLetras;
	private int apenasNumeros;
	private int caracteresRepetidos;
	private int letrasMaiusculasConsecutivas;
	private int letrasMinusculasConsecutivas;
	private int numerosConsecutivos;
	private int tresOuMaisLetrasSequenciais;
	private int tresOuMaisNumerosSequenciais;
	private int tresOuMaisSimbolosSequenciais;

	private int pontuacaoNumeroDeCaracteres;
	private int pontuacaoLetrasMaiusculas;
	private int pontuacaoLetrasMinusculas;
	private int pontuacaoNumeros;
	private int pontuacaoSimbolos;
	private int pontuacaoNumerosDoMeioOuSimbolos;
	private int pontuacaoRequisitos;
	private int pontuacaoApenasLetras;
	private int pontuacaoApenasNumeros;
	private int pontuacaoCaracteresRepetidos;
	private int pontuacaoLetrasMaiusculasConsecutivas;
	private int pontuacaoLetrasMinusculasConsecutivas;
	private int pontuacaoNumerosConsecutivos;
	private int pontuacaoTresOuMaisLetrasSequenciais;
	private int pontuacaoTresOuMaisNumerosSequenciais;
	private int pontuacaoTresOuMaisSimbolosSequenciais;
	public String getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(String complexidade) {
		this.complexidade = complexidade;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public int getNumeroDeCaracteres() {
		return numeroDeCaracteres;
	}
	public void setNumeroDeCaracteres(int numeroDeCaracteres) {
		this.numeroDeCaracteres = numeroDeCaracteres;
	}
	public int getLetrasMaiusculas() {
		return letrasMaiusculas;
	}
	public void setLetrasMaiusculas(int letrasMaiusculas) {
		this.letrasMaiusculas = letrasMaiusculas;
	}
	public int getLetrasMinusculas() {
		return letrasMinusculas;
	}
	public void setLetrasMinusculas(int letrasMinusculas) {
		this.letrasMinusculas = letrasMinusculas;
	}
	public int getNumeros() {
		return numeros;
	}
	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
	public int getSimbolos() {
		return simbolos;
	}
	public void setSimbolos(int simbolos) {
		this.simbolos = simbolos;
	}
	public int getNumerosDoMeioOuSimbolos() {
		return numerosDoMeioOuSimbolos;
	}
	public void setNumerosDoMeioOuSimbolos(int numerosDoMeioOuSimbolos) {
		this.numerosDoMeioOuSimbolos = numerosDoMeioOuSimbolos;
	}
	public int getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(int requisitos) {
		this.requisitos = requisitos;
	}
	public int getApenasLetras() {
		return apenasLetras;
	}
	public void setApenasLetras(int apenasLetras) {
		this.apenasLetras = apenasLetras;
	}
	public int getApenasNumeros() {
		return apenasNumeros;
	}
	public void setApenasNumeros(int apenasNumeros) {
		this.apenasNumeros = apenasNumeros;
	}
	public int getCaracteresRepetidos() {
		return caracteresRepetidos;
	}
	public void setCaracteresRepetidos(int caracteresRepetidos) {
		this.caracteresRepetidos = caracteresRepetidos;
	}
	public int getLetrasMaiusculasConsecutivas() {
		return letrasMaiusculasConsecutivas;
	}
	public void setLetrasMaiusculasConsecutivas(int letrasMaiusculasConsecutivas) {
		this.letrasMaiusculasConsecutivas = letrasMaiusculasConsecutivas;
	}
	public int getLetrasMinusculasConsecutivas() {
		return letrasMinusculasConsecutivas;
	}
	public void setLetrasMinusculasConsecutivas(int letrasMinusculasConsecutivas) {
		this.letrasMinusculasConsecutivas = letrasMinusculasConsecutivas;
	}
	public int getNumerosConsecutivos() {
		return numerosConsecutivos;
	}
	public void setNumerosConsecutivos(int numerosConsecutivos) {
		this.numerosConsecutivos = numerosConsecutivos;
	}
	public int getTresOuMaisLetrasSequenciais() {
		return tresOuMaisLetrasSequenciais;
	}
	public void setTresOuMaisLetrasSequenciais(int tresOuMaisLetrasSequenciais) {
		this.tresOuMaisLetrasSequenciais = tresOuMaisLetrasSequenciais;
	}
	public int getTresOuMaisNumerosSequenciais() {
		return tresOuMaisNumerosSequenciais;
	}
	public void setTresOuMaisNumerosSequenciais(int tresOuMaisNumerosSequenciais) {
		this.tresOuMaisNumerosSequenciais = tresOuMaisNumerosSequenciais;
	}
	public int getTresOuMaisSimbolosSequenciais() {
		return tresOuMaisSimbolosSequenciais;
	}
	public void setTresOuMaisSimbolosSequenciais(int tresOuMaisSimbolosSequenciais) {
		this.tresOuMaisSimbolosSequenciais = tresOuMaisSimbolosSequenciais;
	}
	public int getPontuacaoNumeroDeCaracteres() {
		return pontuacaoNumeroDeCaracteres;
	}
	public void setPontuacaoNumeroDeCaracteres(int pontuacaoNumeroDeCaracteres) {
		this.pontuacaoNumeroDeCaracteres = pontuacaoNumeroDeCaracteres;
	}
	public int getPontuacaoLetrasMaiusculas() {
		return pontuacaoLetrasMaiusculas;
	}
	public void setPontuacaoLetrasMaiusculas(int pontuacaoLetrasMaiusculas) {
		this.pontuacaoLetrasMaiusculas = pontuacaoLetrasMaiusculas;
	}
	public int getPontuacaoLetrasMinusculas() {
		return pontuacaoLetrasMinusculas;
	}
	public void setPontuacaoLetrasMinusculas(int pontuacaoLetrasMinusculas) {
		this.pontuacaoLetrasMinusculas = pontuacaoLetrasMinusculas;
	}
	public int getPontuacaoNumeros() {
		return pontuacaoNumeros;
	}
	public void setPontuacaoNumeros(int pontuacaoNumeros) {
		this.pontuacaoNumeros = pontuacaoNumeros;
	}
	public int getPontuacaoSimbolos() {
		return pontuacaoSimbolos;
	}
	public void setPontuacaoSimbolos(int pontuacaoSimbolos) {
		this.pontuacaoSimbolos = pontuacaoSimbolos;
	}
	public int getPontuacaoNumerosDoMeioOuSimbolos() {
		return pontuacaoNumerosDoMeioOuSimbolos;
	}
	public void setPontuacaoNumerosDoMeioOuSimbolos(
			int pontuacaoNumerosDoMeioOuSimbolos) {
		this.pontuacaoNumerosDoMeioOuSimbolos = pontuacaoNumerosDoMeioOuSimbolos;
	}
	public int getPontuacaoRequisitos() {
		return pontuacaoRequisitos;
	}
	public void setPontuacaoRequisitos(int pontuacaoRequisitos) {
		this.pontuacaoRequisitos = pontuacaoRequisitos;
	}
	public int getPontuacaoApenasLetras() {
		return pontuacaoApenasLetras;
	}
	public void setPontuacaoApenasLetras(int pontuacaoApenasLetras) {
		this.pontuacaoApenasLetras = pontuacaoApenasLetras;
	}
	public int getPontuacaoApenasNumeros() {
		return pontuacaoApenasNumeros;
	}
	public void setPontuacaoApenasNumeros(int pontuacaoApenasNumeros) {
		this.pontuacaoApenasNumeros = pontuacaoApenasNumeros;
	}
	public int getPontuacaoCaracteresRepetidos() {
		return pontuacaoCaracteresRepetidos;
	}
	public void setPontuacaoCaracteresRepetidos(int pontuacaoCaracteresRepetidos) {
		this.pontuacaoCaracteresRepetidos = pontuacaoCaracteresRepetidos;
	}
	public int getPontuacaoLetrasMaiusculasConsecutivas() {
		return pontuacaoLetrasMaiusculasConsecutivas;
	}
	public void setPontuacaoLetrasMaiusculasConsecutivas(
			int pontuacaoLetrasMaiusculasConsecutivas) {
		this.pontuacaoLetrasMaiusculasConsecutivas = pontuacaoLetrasMaiusculasConsecutivas;
	}
	public int getPontuacaoLetrasMinusculasConsecutivas() {
		return pontuacaoLetrasMinusculasConsecutivas;
	}
	public void setPontuacaoLetrasMinusculasConsecutivas(
			int pontuacaoLetrasMinusculasConsecutivas) {
		this.pontuacaoLetrasMinusculasConsecutivas = pontuacaoLetrasMinusculasConsecutivas;
	}
	public int getPontuacaoNumerosConsecutivos() {
		return pontuacaoNumerosConsecutivos;
	}
	public void setPontuacaoNumerosConsecutivos(int pontuacaoNumerosConsecutivos) {
		this.pontuacaoNumerosConsecutivos = pontuacaoNumerosConsecutivos;
	}
	public int getPontuacaoTresOuMaisLetrasSequenciais() {
		return pontuacaoTresOuMaisLetrasSequenciais;
	}
	public void setPontuacaoTresOuMaisLetrasSequenciais(
			int pontuacaoTresOuMaisLetrasSequenciais) {
		this.pontuacaoTresOuMaisLetrasSequenciais = pontuacaoTresOuMaisLetrasSequenciais;
	}
	public int getPontuacaoTresOuMaisNumerosSequenciais() {
		return pontuacaoTresOuMaisNumerosSequenciais;
	}
	public void setPontuacaoTresOuMaisNumerosSequenciais(
			int pontuacaoTresOuMaisNumerosSequenciais) {
		this.pontuacaoTresOuMaisNumerosSequenciais = pontuacaoTresOuMaisNumerosSequenciais;
	}
	public int getPontuacaoTresOuMaisSimbolosSequenciais() {
		return pontuacaoTresOuMaisSimbolosSequenciais;
	}
	public void setPontuacaoTresOuMaisSimbolosSequenciais(
			int pontuacaoTresOuMaisSimbolosSequenciais) {
		this.pontuacaoTresOuMaisSimbolosSequenciais = pontuacaoTresOuMaisSimbolosSequenciais;
	}
	
}
