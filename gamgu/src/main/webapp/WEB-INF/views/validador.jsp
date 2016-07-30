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
				   		$('#numeroDeCaracteres').text('numeroDeCaracteres                    :'+retorno.numeroDeCaracteres                    );
				   		$('#letrasMaiusculas').text('letrasMaiusculas                      :'+retorno.letrasMaiusculas                      );
				   		$('#letrasMinusculas').text('letrasMinusculas                      :'+retorno.letrasMinusculas                      );
				   		$('#numeros').text('numeros                               :'+retorno.numeros                               );
				   		$('#simbolos').text('simbolos                              :'+retorno.simbolos                              );
				   		$('#numerosDoMeioOuSimbolos').text('numerosDoMeioOuSimbolos               :'+retorno.numerosDoMeioOuSimbolos               );
				   		$('#requisitos').text('requisitos                            :'+retorno.requisitos                            );
				   		$('#apenasLetras').text('apenasLetras                          :'+retorno.apenasLetras                          );
				   		$('#apenasNumeros').text('apenasNumeros                         :'+retorno.apenasNumeros                         );
				   		$('#caracteresRepetidos').text('caracteresRepetidos                   :'+retorno.caracteresRepetidos                   );
				   		$('#letrasMaiusculasConsecutivas').text('letrasMaiusculasConsecutivas          :'+retorno.letrasMaiusculasConsecutivas          );
				   		$('#letrasMinusculasConsecutivas').text('letrasMinusculasConsecutivas          :'+retorno.letrasMinusculasConsecutivas          );
				   		$('#numerosConsecutivos').text('numerosConsecutivos                   :'+retorno.numerosConsecutivos                   );
				   		$('#tresOuMaisLetrasSequenciais').text('tresOuMaisLetrasSequenciais           :'+retorno.tresOuMaisLetrasSequenciais           );
				   		$('#tresOuMaisNumerosSequenciais').text('tresOuMaisNumerosSequenciais          :'+retorno.tresOuMaisNumerosSequenciais          );
				   		$('#tresOuMaisSimbolosSequenciais').text('tresOuMaisSimbolosSequenciais         :'+retorno.tresOuMaisSimbolosSequenciais         );
				   		$('#pontuacaoNumeroDeCaracteres').text('pontuacaoNumeroDeCaracteres           :'+retorno.pontuacaoNumeroDeCaracteres           );
				   		$('#pontuacaoLetrasMaiusculas').text('pontuacaoLetrasMaiusculas             :'+retorno.pontuacaoLetrasMaiusculas             );
				   		$('#pontuacaoLetrasMinusculas').text('pontuacaoLetrasMinusculas             :'+retorno.pontuacaoLetrasMinusculas             );
				   		$('#pontuacaoNumeros').text('pontuacaoNumeros                      :'+retorno.pontuacaoNumeros                      );
				   		$('#pontuacaoSimbolos').text('pontuacaoSimbolos                     :'+retorno.pontuacaoSimbolos                     );
				   		$('#pontuacaoNumerosDoMeioOuSimbolos').text('pontuacaoNumerosDoMeioOuSimbolos      :'+retorno.pontuacaoNumerosDoMeioOuSimbolos      );
				   		$('#pontuacaoRequisitos').text('pontuacaoRequisitos                   :'+retorno.pontuacaoRequisitos                   );
				   		$('#pontuacaoApenasLetras').text('pontuacaoApenasLetras                 :'+retorno.pontuacaoApenasLetras                 );
				   		$('#pontuacaoApenasNumeros').text('pontuacaoApenasNumeros                :'+retorno.pontuacaoApenasNumeros                );
				   		$('#pontuacaoCaracteresRepetidos').text('pontuacaoCaracteresRepetidos          :'+retorno.pontuacaoCaracteresRepetidos          );
				   		$('#pontuacaoLetrasMaiusculasConsecutivas').text('pontuacaoLetrasMaiusculasConsecutivas :'+retorno.pontuacaoLetrasMaiusculasConsecutivas );
				   		$('#pontuacaoLetrasMinusculasConsecutivas').text('pontuacaoLetrasMinusculasConsecutivas :'+retorno.pontuacaoLetrasMinusculasConsecutivas );
				   		$('#pontuacaoNumerosConsecutivos').text('pontuacaoNumerosConsecutivos          :'+retorno.pontuacaoNumerosConsecutivos          );
				   		$('#pontuacaoTresOuMaisLetrasSequenciais').text('pontuacaoTresOuMaisLetrasSequenciais  :'+retorno.pontuacaoTresOuMaisLetrasSequenciais  );
				   		$('#pontuacaoTresOuMaisNumerosSequenciais').text('pontuacaoTresOuMaisNumerosSequenciais :'+retorno.pontuacaoTresOuMaisNumerosSequenciais );
				   		$('#pontuacaoTresOuMaisSimbolosSequenciais').text('pontuacaoTresOuMaisSimbolosSequenciais:'+retorno.pontuacaoTresOuMaisSimbolosSequenciais);
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
<h5	id="numeroDeCaracteres"/>
<h5	id="letrasMaiusculas"/>
<h5	id="letrasMinusculas"/>
<h5	id="numeros"/>
<h5 id="simbolos" />
<h5 id="numerosDoMeioOuSimbolos" />
<h5 id="requisitos" />
<h5 id="apenasLetras" />
<h5 id="apenasNumeros" />
<h5 id="caracteresRepetidos" />
<h5 id="letrasMaiusculasConsecutivas" />
<h5 id="letrasMinusculasConsecutivas" />
<h5 id="numerosConsecutivos" />
<h5 id="tresOuMaisLetrasSequenciais" />
<h5 id="tresOuMaisNumerosSequenciais" />
<h5 id="tresOuMaisSimbolosSequenciais" />
<h5 id="pontuacaoNumeroDeCaracteres" />
<h5 id="pontuacaoLetrasMaiusculas" />
<h5 id="pontuacaoLetrasMinusculas" />
<h5 id="pontuacaoNumeros" />
<h5 id="pontuacaoSimbolos" />
<h5 id="pontuacaoNumerosDoMeioOuSimbolos" />
<h5 id="pontuacaoRequisitos" />
<h5 id="pontuacaoApenasLetras" />
<h5 id="pontuacaoApenasNumeros" />
<h5 id="pontuacaoCaracteresRepetidos" />
<h5 id="pontuacaoLetrasMaiusculasConsecutivas" />
<h5 id="pontuacaoLetrasMinusculasConsecutivas" />
<h5 id="pontuacaoNumerosConsecutivos" />
<h5 id="pontuacaoTresOuMaisLetrasSequenciais" />
<h5 id="pontuacaoTresOuMaisNumerosSequenciais" />
<h5 id="pontuacaoTresOuMaisSimbolosSequenciais" />
-->    
</body>
</html>