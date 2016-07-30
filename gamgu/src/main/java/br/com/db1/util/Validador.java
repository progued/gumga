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
import br.com.db1.bean.Resultado;

public class Validador {

	public static Resultado validaSenha(String senha){
		
		int tamanhoDaSenha = senha.length();
		int nota = tamanhoDaSenha*PESO_NUMERO_DE_CARACTERES;
		
		String senhaSemEspacosEmBranco = senha.trim().replace(" ", "");
		int tamanhoRealDaSenha = senhaSemEspacosEmBranco.length();

		int contadorLetrasMaiusculasConsecutivas = 0;
		int contadorLetrasMinusculasConsecutivas = 0;
		int contadorNumerosConsecutivos = 0;
		int contadorLetrasMaiusculas = 0;
		int contadorLetrasMinusculas = 0;
		int contadorNumeros = 0;
		int contadorSimbolos = 0;
		int contadorRepeticaoCaracteres = 0;
		int contadorSequenciaLetras = 0; 
		int contadorSequenciaNumeros = 0; 
		int contadorSequenciaSimbolos = 0; 
		int contadorNumeroDoMeioSimbolo = 0;

		int tamanhoMenosRepeticoes = 0;
		Double contadorRepeticoesIncremental = 0.0; 

		int posicaoUltimaLetrasMaiusculas = -1;
		int posicaoUltimaLetrasMinusculas = -1;
		int posicaoUltimoNumero = -1;
				
		String caracter = "";
		String caracterAuxiliar = "";
		
		for (int i = 0; i < tamanhoRealDaSenha; i++) {
			caracter = String.valueOf(senhaSemEspacosEmBranco.charAt(i));
			if(caracter.matches("[A-Z]")){
				if(posicaoUltimaLetrasMaiusculas != 0 && (posicaoUltimaLetrasMaiusculas + 1) == i)
					contadorLetrasMaiusculasConsecutivas++;
	
				posicaoUltimaLetrasMaiusculas=i;
				contadorLetrasMaiusculas++;
			}else if(caracter.matches("[a-z]")){
				if(posicaoUltimaLetrasMinusculas != 0 && (posicaoUltimaLetrasMinusculas + 1) == i)
					contadorLetrasMinusculasConsecutivas++;
	
				posicaoUltimaLetrasMinusculas=i;
				contadorLetrasMinusculas++;
			}else if(caracter.matches("[0-9]")){
				if (i > 0 && i < (tamanhoRealDaSenha - 1))  
					contadorNumeroDoMeioSimbolo++; 
				
				if(posicaoUltimoNumero != 0 && (posicaoUltimoNumero + 1) == i)
					contadorNumerosConsecutivos++;
	
				posicaoUltimoNumero = i;
				contadorNumeros++;
			}else if(caracter.matches("[^a-zA-Z0-9_]")){
				if (i > 0 && i < (tamanhoRealDaSenha - 1))  
					contadorNumeroDoMeioSimbolo++; 
	
				contadorSimbolos++;
			}

			boolean caracterJaExiste = false;
			
			for (int j = 0; j < tamanhoRealDaSenha; j++) {
				caracterAuxiliar = String.valueOf(senhaSemEspacosEmBranco.charAt(j));
				if(caracter.equals(caracterAuxiliar) && i != j){
					caracterJaExiste = true;
					contadorRepeticoesIncremental = Double.valueOf(Math.abs(tamanhoRealDaSenha/(j-i)));
				}
			}
			if (caracterJaExiste) { 
				contadorRepeticaoCaracteres++; 
				tamanhoMenosRepeticoes = tamanhoRealDaSenha-contadorRepeticaoCaracteres;
				contadorRepeticoesIncremental = (tamanhoMenosRepeticoes > 0) ? Math.ceil(contadorRepeticoesIncremental/tamanhoMenosRepeticoes) : Math.ceil(contadorRepeticoesIncremental); 
			}
		}

		String sequenciaCorreta = "";
		String sequenciaInvertida = "";
		
		for (int i=0; i < 23; i++) {
			sequenciaCorreta = ALFABETO.substring(i,i+3);
			sequenciaInvertida = new StringBuffer(sequenciaCorreta).reverse().toString();
			if (senha.toLowerCase().indexOf(sequenciaCorreta) != -1 || senha.toLowerCase().indexOf(sequenciaInvertida) != -1) { 
				contadorSequenciaLetras++; 
			}
		}
		
		for (int i=0; i < 8; i++) {
			sequenciaCorreta = NUMEROS.substring(i,i+3);
			sequenciaInvertida = new StringBuffer(sequenciaCorreta).reverse().toString();
			if (senha.toLowerCase().indexOf(sequenciaCorreta) != -1 || senha.toLowerCase().indexOf(sequenciaInvertida) != -1) { 
				contadorSequenciaNumeros++; 
			}
		}
		
		for (int i=0; i < 8; i++) {
			sequenciaCorreta = SIMBOLOS.substring(i,i+3);
			sequenciaInvertida = new StringBuffer(sequenciaCorreta).reverse().toString();
			if (senha.toLowerCase().indexOf(sequenciaCorreta) != -1 || senha.toLowerCase().indexOf(sequenciaInvertida) != -1) { 
				contadorSequenciaSimbolos++; 
			}
		}

		Resultado resultado = new Resultado();
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
		
		if (nota > 100) 
			nota = 100;
		else if (nota < 0) 
			nota = 0; 
		
		String complexidade = "Muito curta";
		
		if (nota >= 0 && nota < 20) 
			complexidade = "Muito fraca";
		else if (nota >= 20 && nota < 40) 
			complexidade = "Fraca";
		else if (nota >= 40 && nota < 60)
			complexidade = "Boa";
		else if (nota >= 60 && nota < 80) 
			complexidade = "Forte";
		else if (nota >= 80 && nota <= 100)
			complexidade = "Muito forte";
		
		resultado.setNota(nota);
		resultado.setComplexidade(complexidade);
	
		return resultado;
	}
	
}
