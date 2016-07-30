<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Gamgu</title>
    <script type="text/javascript" src="<c:url value="/resources/json2.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/script.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/jqueryform/2.8/jquery.form.js" />"></script>
	<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />	
	<script type="text/javascript">
		function validarSenha(){
			 $.ajax({
				  type: "post",
				  url: "${home}validador",
				  cache: false,    
				  data:'senha=' + $("#senha").val(),
				  success: function(retorno){
						var nota = retorno.nota;
				   		$('#nota').text(nota+'%');
				   		$('#complexidade').text(retorno.complexidade);
				   		if (nota >= 0 && nota < 20) 
							$('#complexidade').css('background-color', 'red');
						else if (nota >= 20 && nota < 40) 
							$('#complexidade').css('background-color', 'darkorange');
						else if (nota >= 40 && nota < 60)
							$('#complexidade').css('background-color', 'gold');
						else if (nota >= 60 && nota < 80) 
							$('#complexidade').css('background-color', 'limegreen');
						else if (nota >= 80 && nota <= 100)
							$('#complexidade').css('background-color', 'darkgreen');
				   		<!--
				   		$('#numeroDeCaracteres').text('numeroDeCaracteres                    :'+retorno.numeroDeCaracteres+' (+'+retorno.pontuacaoNumeroDeCaracteres+')');
				   		$('#letrasMaiusculas').text('letrasMaiusculas                      :'+retorno.letrasMaiusculas+' (+'+retorno.pontuacaoLetrasMaiusculas+')');    
				   		$('#letrasMinusculas').text('letrasMinusculas                      :'+retorno.letrasMinusculas+' (+'+retorno.pontuacaoLetrasMinusculas+')');    
				   		$('#numeros').text('numeros                               :'+retorno.numeros+' (+'+retorno.pontuacaoNumeros+')');                      
				   		$('#simbolos').text('simbolos                              :'+retorno.simbolos+' (+'+retorno.pontuacaoSimbolos+')');                    
				   		$('#numerosDoMeioOuSimbolos').text('numerosDoMeioOuSimbolos               :'+retorno.numerosDoMeioOuSimbolos+' (+'+retorno.pontuacaoNumerosDoMeioOuSimbolos+')');               
				   		$('#requisitos').text('requisitos                            :'+retorno.requisitos+' (+'+retorno.pontuacaoRequisitos+')');                            
				   		$('#apenasLetras').text('apenasLetras                          :'+retorno.apenasLetras+' (-'+retorno.pontuacaoApenasLetras+')');                        
				   		$('#apenasNumeros').text('apenasNumeros                         :'+retorno.apenasNumeros+' (-'+retorno.pontuacaoApenasNumeros+')');                      
				   		$('#caracteresRepetidos').text('caracteresRepetidos                   :'+retorno.caracteresRepetidos+' (-'+retorno.pontuacaoCaracteresRepetidos+')');                   
				   		$('#letrasMaiusculasConsecutivas').text('letrasMaiusculasConsecutivas          :'+retorno.letrasMaiusculasConsecutivas+' (-'+retorno.pontuacaoLetrasMaiusculasConsecutivas+')');          
				   		$('#letrasMinusculasConsecutivas').text('letrasMinusculasConsecutivas          :'+retorno.letrasMinusculasConsecutivas+' (-'+retorno.pontuacaoLetrasMinusculasConsecutivas+')');          
				   		$('#numerosConsecutivos').text('numerosConsecutivos                   :'+retorno.numerosConsecutivos+' (-'+retorno.pontuacaoNumerosConsecutivos+')');                   
				   		$('#tresOuMaisLetrasSequenciais').text('tresOuMaisLetrasSequenciais           :'+retorno.tresOuMaisLetrasSequenciais+' (-'+retorno.pontuacaoTresOuMaisLetrasSequenciais+')');           
				   		$('#tresOuMaisNumerosSequenciais').text('tresOuMaisNumerosSequenciais          :'+retorno.tresOuMaisNumerosSequenciais+' (-'+retorno.pontuacaoTresOuMaisNumerosSequenciais+')');          
				   		$('#tresOuMaisSimbolosSequenciais').text('tresOuMaisSimbolosSequenciais         :'+retorno.tresOuMaisSimbolosSequenciais+' (-'+retorno.pontuacaoTresOuMaisSimbolosSequenciais+')');         
				   		-->
				  },
				  error: function(){      
				   		alert('Falha durante a tentativa de validação...');
				  }
			 });
		}
	</script>    
</head>
<body>
	<div id="principal">
    	<a id="titulo">AVALIADOR DE SEGURANÇA DE SENHA</a><br/>
		<div id="interna">
    		<input type="password" id="senha" onkeyup="validarSenha();"/><br/>
    		<div id="resultado">
    			<div id="nota">0%</div>
    			<div id="meio"></div>
    			<div id="complexidade">Muito curta</div>
    		</div>
    	</div>
    </div>
 <!-- 
<h6	id="numeroDeCaracteres" style="color: blue"/>
<h6	id="letrasMaiusculas" style="color: blue"/>
<h6	id="letrasMinusculas" style="color: blue"/>
<h6	id="numeros" style="color: blue"/>
<h6 id="simbolos" style="color: blue"/>
<h6 id="numerosDoMeioOuSimbolos" style="color: blue"/>
<h6 id="requisitos" style="color: blue"/>
<h6 id="apenasLetras" style="color: red"/>
<h6 id="apenasNumeros" style="color: red"/>
<h6 id="caracteresRepetidos" style="color: red"/>
<h6 id="letrasMaiusculasConsecutivas" style="color: red"/>
<h6 id="letrasMinusculasConsecutivas" style="color: red"/>
<h6 id="numerosConsecutivos" style="color: red"/>
<h6 id="tresOuMaisLetrasSequenciais" style="color: red"/>
<h6 id="tresOuMaisNumerosSequenciais" style="color: red"/>
<h6 id="tresOuMaisSimbolosSequenciais" style="color: red"/>
-->
</body>
</html>