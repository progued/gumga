package br.com.db1.util;

import static br.com.db1.util.Constantes.ALFABETO;
import static br.com.db1.util.Constantes.NUMEROS;
import static br.com.db1.util.Constantes.PESO_LETRAS_MAIUSCULAS_CONSECUTIVAS;
import static br.com.db1.util.Constantes.PESO_LETRAS_MINUSCULAS_CONSECUTIVAS;
import static br.com.db1.util.Constantes.PESO_NUMEROS;
import static br.com.db1.util.Constantes.PESO_NUMEROS_CONSECUTIVOS;
import static br.com.db1.util.Constantes.PESO_NUMEROS_DO_MEIO_OU_SIMBOLOS;
import static br.com.db1.util.Constantes.PESO_NUMERO_DE_CARACTERES;
import static br.com.db1.util.Constantes.PESO_SIMBOLOS;
import static br.com.db1.util.Constantes.PESO_TRES_OU_MAIS_LETRAS_SEQUENCIAIS;
import static br.com.db1.util.Constantes.PESO_TRES_OU_MAIS_NUMEROS_SEQUENCIAIS;
import static br.com.db1.util.Constantes.PESO_TRES_OU_MAIS_SIMBOLOS_SEQUENCIAIS;
import static br.com.db1.util.Constantes.SIMBOLOS;
import static br.com.db1.util.Constantes.TAMANHO_MINIMO_PARA_SENHA;
import static br.com.db1.util.Constantes.COMPLEXIDADE_MUITO_CURTA;
import static br.com.db1.util.Constantes.COMPLEXIDADE_MUITO_FORTE;
import static br.com.db1.util.Constantes.COMPLEXIDADE_FORTE;
import static br.com.db1.util.Constantes.COMPLEXIDADE_BOA;
import static br.com.db1.util.Constantes.COMPLEXIDADE_FRACA;
import static br.com.db1.util.Constantes.COMPLEXIDADE_MUITO_FRACA;
import br.com.db1.bean.Resultado;

public class Validador {

	Resultado resultado;
	int nota;
	int tamanhoDaSenha;
	int tamanhoRealDaSenha;
	int contadorLetrasMaiusculasConsecutivas;
	int contadorLetrasMinusculasConsecutivas;
	int contadorNumerosConsecutivos;
	int contadorLetrasMaiusculas;
	int contadorLetrasMinusculas;
	int contadorNumeros;
	int contadorSimbolos;
	int contadorRepeticaoCaracteres;
	int contadorSequenciaLetras; 
	int contadorSequenciaNumeros; 
	int contadorSequenciaSimbolos; 
	int contadorNumeroDoMeioSimbolo;
	String senhaSemEspacosEmBranco;
	String sequenciaCorreta;
	String sequenciaInvertida;
	Double contadorRepeticoesIncremental = 0.0; 
	String complexidade;

	public Resultado validaSenha(String senha){
		
		inicializaVariaveis(senha);

		verificaExistenciaDeLetrasNumerosSimbolos();

		verificaExistenciaDeSequencias(senha);

		alimentaResultado();
		
		garanteNotaPertenceAoIntervaloValido(); 
		
		verificaComplexidade();
		
		alimentaNotaEComplexidadeNoResultado();
	
		return resultado;
	}

	private void alimentaResultado() {
		alimentaPontuacoesNoResultado();

		alimentaContadoresNoResultado();
	}

	private void verificaExistenciaDeSequencias(String senha) {
		verificaExistenciaDeLetrasSequenciais(senha);
		
		verificaExistenciaDeNumerosSequenciais(senha);
		
		verificaExistenciaDeSimbolosSequencias(senha);
	}

	private void alimentaNotaEComplexidadeNoResultado() {
		resultado.setNota(nota);
		resultado.setComplexidade(complexidade);
	}

	private void verificaComplexidade() {
		if(tamanhoDaSenha <= 0)
			return;

		if (nota >= 0 && nota < 20) 
			complexidade = COMPLEXIDADE_MUITO_FRACA;
		else if (nota >= 20 && nota < 40) 
			complexidade = COMPLEXIDADE_FRACA;
		else if (nota >= 40 && nota < 60)
			complexidade = COMPLEXIDADE_BOA;
		else if (nota >= 60 && nota < 80) 
			complexidade = COMPLEXIDADE_FORTE;
		else if (nota >= 80 && nota <= 100)
			complexidade = COMPLEXIDADE_MUITO_FORTE;
	}

	private void garanteNotaPertenceAoIntervaloValido() {
		if (nota > 100) 
			nota = 100;
		else if (nota < 0) 
			nota = 0;
	}

	private void alimentaPontuacoesNoResultado() {
		resultado.setPontuacaoNumeroDeCaracteres(nota);

		if (contadorLetrasMaiusculas > 0 && contadorLetrasMaiusculas < tamanhoDaSenha) {	
			nota = nota + ((tamanhoDaSenha - contadorLetrasMaiusculas) * 2);
			resultado.setPontuacaoLetrasMaiusculas((tamanhoDaSenha - contadorLetrasMaiusculas) * 2); 
		}
		if (contadorLetrasMinusculas > 0 && contadorLetrasMinusculas < tamanhoDaSenha) {	
			nota = nota + ((tamanhoDaSenha - contadorLetrasMinusculas) * 2); 
			resultado.setPontuacaoLetrasMinusculas((tamanhoDaSenha - contadorLetrasMinusculas) * 2);
		}
		if (contadorNumeros > 0 && contadorNumeros < tamanhoDaSenha) {	
			nota = nota + (contadorNumeros * PESO_NUMEROS);
			resultado.setPontuacaoNumeros(contadorNumeros * PESO_NUMEROS);
		}
		if (contadorSimbolos > 0) {	
			nota = nota + (contadorSimbolos * PESO_SIMBOLOS);
			resultado.setPontuacaoSimbolos(contadorSimbolos * PESO_SIMBOLOS);
		}
		if (contadorNumeroDoMeioSimbolo > 0) {	
			nota = nota + (contadorNumeroDoMeioSimbolo * PESO_NUMEROS_DO_MEIO_OU_SIMBOLOS);
			resultado.setPontuacaoNumerosDoMeioOuSimbolos(contadorNumeroDoMeioSimbolo * PESO_NUMEROS_DO_MEIO_OU_SIMBOLOS);
		}

		if ((contadorLetrasMinusculas > 0 || contadorLetrasMaiusculas > 0) && contadorSimbolos == 0 && contadorNumeros == 0) {  
			nota = nota - tamanhoDaSenha;
			resultado.setApenasLetras(tamanhoDaSenha);
			resultado.setPontuacaoApenasLetras(tamanhoDaSenha);
		}
		if (contadorLetrasMinusculas == 0 && contadorLetrasMaiusculas == 0 && contadorSimbolos == 0 && contadorNumeros > 0) {  
			nota = nota - tamanhoDaSenha; 
			resultado.setApenasNumeros(tamanhoDaSenha);
			resultado.setPontuacaoApenasNumeros(tamanhoDaSenha);
		}
		if (contadorRepeticaoCaracteres > 0) {  
			nota = nota - contadorRepeticoesIncremental.intValue();
			resultado.setPontuacaoCaracteresRepetidos(contadorRepeticoesIncremental.intValue());
		}
		if (contadorLetrasMaiusculasConsecutivas > 0) { 
			nota = nota - (contadorLetrasMaiusculasConsecutivas * PESO_LETRAS_MAIUSCULAS_CONSECUTIVAS); 
			resultado.setPontuacaoLetrasMaiusculasConsecutivas(contadorLetrasMaiusculasConsecutivas * PESO_LETRAS_MAIUSCULAS_CONSECUTIVAS);
		}
		if (contadorLetrasMinusculasConsecutivas > 0) { 
			nota = nota - (contadorLetrasMinusculasConsecutivas * PESO_LETRAS_MINUSCULAS_CONSECUTIVAS); 
			resultado.setPontuacaoLetrasMinusculasConsecutivas(contadorLetrasMinusculasConsecutivas * PESO_LETRAS_MINUSCULAS_CONSECUTIVAS);
		}
		if (contadorNumerosConsecutivos > 0) { 
			nota = nota - (contadorNumerosConsecutivos * PESO_NUMEROS_CONSECUTIVOS); 
			resultado.setPontuacaoNumerosConsecutivos(contadorNumerosConsecutivos * PESO_NUMEROS_CONSECUTIVOS);
		}
		if (contadorSequenciaLetras > 0) { 
			nota = nota - (contadorSequenciaLetras * PESO_TRES_OU_MAIS_LETRAS_SEQUENCIAIS); 
			resultado.setPontuacaoTresOuMaisLetrasSequenciais(contadorSequenciaLetras * PESO_TRES_OU_MAIS_LETRAS_SEQUENCIAIS);
		}
		if (contadorSequenciaNumeros > 0) { 
			nota = nota - (contadorSequenciaNumeros * PESO_TRES_OU_MAIS_NUMEROS_SEQUENCIAIS); 
			resultado.setPontuacaoTresOuMaisNumerosSequenciais(contadorSequenciaNumeros * PESO_TRES_OU_MAIS_NUMEROS_SEQUENCIAIS);
		}
		if (contadorSequenciaSimbolos > 0) { 
			nota = nota - (contadorSequenciaSimbolos * PESO_TRES_OU_MAIS_SIMBOLOS_SEQUENCIAIS); 
			resultado.setPontuacaoTresOuMaisSimbolosSequenciais(contadorSequenciaLetras * PESO_TRES_OU_MAIS_SIMBOLOS_SEQUENCIAIS);
		}
	}

	private void alimentaContadoresNoResultado() {
		resultado.setNumeroDeCaracteres(tamanhoDaSenha);
		resultado.setLetrasMaiusculas(contadorLetrasMaiusculas);
		resultado.setLetrasMinusculas(contadorLetrasMinusculas);
		resultado.setNumeros(contadorNumeros);
		resultado.setSimbolos(contadorSimbolos);
					
		int contadorDeRequerimentos = 0;
		
		if(tamanhoDaSenha  >= TAMANHO_MINIMO_PARA_SENHA)
			contadorDeRequerimentos++;
		if(contadorLetrasMaiusculas  >= 1)
			contadorDeRequerimentos++;
		if(contadorLetrasMinusculas  >= 1)
			contadorDeRequerimentos++;
		if(contadorNumeros  >= 1)
			contadorDeRequerimentos++;
		if(contadorSimbolos  >= 1)
			contadorDeRequerimentos++;
		
		int minimoCaracteresRequeridos = 0;
		if (tamanhoRealDaSenha >= TAMANHO_MINIMO_PARA_SENHA)  
			minimoCaracteresRequeridos = 3; 
		else 
			minimoCaracteresRequeridos = 4;
		if (contadorDeRequerimentos > minimoCaracteresRequeridos) { 
			nota = nota + (contadorDeRequerimentos * 2); 
			resultado.setPontuacaoRequisitos(contadorDeRequerimentos * 2);
		}

		resultado.setNumerosDoMeioOuSimbolos(contadorNumeroDoMeioSimbolo);
		resultado.setRequisitos(contadorDeRequerimentos);

		resultado.setCaracteresRepetidos(contadorRepeticaoCaracteres);
		resultado.setLetrasMaiusculasConsecutivas(contadorLetrasMaiusculasConsecutivas);
		resultado.setLetrasMinusculasConsecutivas(contadorLetrasMinusculasConsecutivas);
		resultado.setNumerosConsecutivos(contadorNumerosConsecutivos);
		resultado.setTresOuMaisLetrasSequenciais(contadorSequenciaLetras);
		resultado.setTresOuMaisNumerosSequenciais(contadorSequenciaNumeros);
		resultado.setTresOuMaisSimbolosSequenciais(contadorSequenciaSimbolos);
	}

	private void verificaExistenciaDeSimbolosSequencias(String senha) {
		for (int i=0; i < 8; i++) {
			sequenciaCorreta = SIMBOLOS.substring(i,i+3);
			sequenciaInvertida = new StringBuffer(sequenciaCorreta).reverse().toString();
			if (senha.toLowerCase().indexOf(sequenciaCorreta) != -1 || senha.toLowerCase().indexOf(sequenciaInvertida) != -1) { 
				contadorSequenciaSimbolos++; 
			}
		}
	}

	private void verificaExistenciaDeNumerosSequenciais(String senha) {
		for (int i=0; i < 8; i++) {
			sequenciaCorreta = NUMEROS.substring(i,i+3);
			sequenciaInvertida = new StringBuffer(sequenciaCorreta).reverse().toString();
			if (senha.toLowerCase().indexOf(sequenciaCorreta) != -1 || senha.toLowerCase().indexOf(sequenciaInvertida) != -1) { 
				contadorSequenciaNumeros++; 
			}
		}
	}

	private void verificaExistenciaDeLetrasSequenciais(String senha) {
		for (int i=0; i < 23; i++) {
			sequenciaCorreta = ALFABETO.substring(i,i+3);
			sequenciaInvertida = new StringBuffer(sequenciaCorreta).reverse().toString();
			if (senha.toLowerCase().indexOf(sequenciaCorreta) != -1 || senha.toLowerCase().indexOf(sequenciaInvertida) != -1) { 
				contadorSequenciaLetras++; 
			}
		}
	}

	private void verificaExistenciaDeLetrasNumerosSimbolos() {
		int posicaoUltimaLetrasMaiusculas = -1;
		int posicaoUltimaLetrasMinusculas = -1;
		int posicaoUltimoNumero = -1;
				
		String caracter = "";

		for (int posicao = 0; posicao < tamanhoRealDaSenha; posicao++) {
			caracter = String.valueOf(senhaSemEspacosEmBranco.charAt(posicao));
			if(caracter.matches("[A-Z]")){
				if(posicaoUltimaLetrasMaiusculas >= 0 && (posicaoUltimaLetrasMaiusculas + 1) == posicao)
					contadorLetrasMaiusculasConsecutivas++;
	
				posicaoUltimaLetrasMaiusculas=posicao;
				contadorLetrasMaiusculas++;
			}else if(caracter.matches("[a-z]")){
				if(posicaoUltimaLetrasMinusculas >= 0 && (posicaoUltimaLetrasMinusculas + 1) == posicao)
					contadorLetrasMinusculasConsecutivas++;
	
				posicaoUltimaLetrasMinusculas=posicao;
				contadorLetrasMinusculas++;
			}else if(caracter.matches("[0-9]")){
				if (posicao > 0 && posicao < (tamanhoRealDaSenha - 1))  
					contadorNumeroDoMeioSimbolo++; 
				
				if(posicaoUltimoNumero >= 0 && (posicaoUltimoNumero + 1) == posicao)
					contadorNumerosConsecutivos++;
	
				posicaoUltimoNumero = posicao;
				contadorNumeros++;
			}else if(caracter.matches("[^a-zA-Z0-9_]")){
				if (posicao > 0 && posicao < (tamanhoRealDaSenha - 1))  
					contadorNumeroDoMeioSimbolo++; 
	
				contadorSimbolos++;
			}

			verificaRepeticaoDeCaracteres(caracter, posicao);
		}
	}

	private void verificaRepeticaoDeCaracteres(String caracter, int posicao) {
		int tamanhoMenosRepeticoes = 0;
		boolean caracterJaExiste = false;
		caracterJaExiste = verificaSeCaracterJaExiste(caracter, posicao);
		if (caracterJaExiste) { 
			contadorRepeticaoCaracteres++; 
			tamanhoMenosRepeticoes = tamanhoRealDaSenha-contadorRepeticaoCaracteres;
			contadorRepeticoesIncremental = (tamanhoMenosRepeticoes > 0) ? Math.ceil((double)contadorRepeticoesIncremental/tamanhoMenosRepeticoes) : Math.ceil(contadorRepeticoesIncremental); 
		}
	}

	private boolean verificaSeCaracterJaExiste(String caracter, int posicao) {
		String caracterAuxiliar = "";
		boolean caracterJaExiste = false;
		for (int posicaoCaracterAuxiliar = 0; posicaoCaracterAuxiliar < tamanhoRealDaSenha; posicaoCaracterAuxiliar++) {
			caracterAuxiliar = String.valueOf(senhaSemEspacosEmBranco.charAt(posicaoCaracterAuxiliar));
			if(caracter.equals(caracterAuxiliar) && posicao != posicaoCaracterAuxiliar){
				caracterJaExiste = true;
				contadorRepeticoesIncremental += Math.abs((double)tamanhoRealDaSenha/(posicaoCaracterAuxiliar-posicao));
			}
		}
		return caracterJaExiste;
	}

	private void inicializaVariaveis(String senha) {
		resultado = new Resultado();

		tamanhoDaSenha = senha.length();
		nota = tamanhoDaSenha*PESO_NUMERO_DE_CARACTERES;
		
		senhaSemEspacosEmBranco = senha.trim().replace(" ", "");
		tamanhoRealDaSenha = senhaSemEspacosEmBranco.length();

		contadorLetrasMaiusculasConsecutivas = 0;
		contadorLetrasMinusculasConsecutivas = 0;
		contadorNumerosConsecutivos = 0;
		contadorLetrasMaiusculas = 0;
		contadorLetrasMinusculas = 0;
		contadorNumeros = 0;
		contadorSimbolos = 0;
		contadorRepeticaoCaracteres = 0;
		contadorSequenciaLetras = 0; 
		contadorSequenciaNumeros = 0; 
		contadorSequenciaSimbolos = 0; 
		contadorNumeroDoMeioSimbolo = 0;
		contadorRepeticoesIncremental = 0.0;
		sequenciaCorreta = "";
		sequenciaInvertida = "";
		complexidade = COMPLEXIDADE_MUITO_CURTA;
	}
	
}
