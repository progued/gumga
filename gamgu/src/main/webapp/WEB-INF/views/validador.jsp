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
				   		$('#nota').text(retorno.nota+'%');
				   		$('#complexidade').text(retorno.complexidade);
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
    			<div id="nota">100%</div>
    			<div id="meio"></div>
    			<div id="complexidade">Muito curta</div>
    		</div>
    	</div>
    </div>
</body>
</html>