<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang = "pt-br">
<head>
<meta charset="utf-8">
<title>Algoritmos Java</title>
<link href="style.css" rel="stylesheet">
<link href="buttons.css" rel="stylesheet">
</head>
<a > <img id="teste" class="flipInf"
	src="image/javaLogo.png" width="120px" height="219px" />
</a>
<body>
		<div id = "formM">
			<form  action="algoritmo1" id="formJv1">
			<h1>Numero Primo</h1>
            Numero:<input type="text" name="txtTeste"/><br>
            <input type="submit" value="Enviar"/>
            <button onclick="window.location.href = 'index.html';"  ">Voltar</button>
			</form>
			
			<form  action="algoritmo2" id="formJv2">
			<h1>Somatorio</h1>
            Numeros:<input type="text" name="txtTeste"/><br>
            <input type="submit" value="Enviar"/>
            <button onclick="window.location.href = 'index.html';"  ">Voltar</button>
			</form>
			
			<form  action="algoritmo3" id="formJv3">
			<h1>Fibonnaci</h1>
           	Fibo:<input type="text" name="txtTeste"/><br>
            <input type="submit" value="Enviar"/>
            <button onclick="window.location.href = 'index.html';"  ">Voltar</button>
			</form>
			
			<form  action="algoritmo4" id="formJv4">
			<h1>Mdc</h1>
           	Primeiro Valor:<input type="text" name="txtTeste"/><br>
           	Segundo Valor:<input type="text" name="txtTeste1"/><br>
            <input type="submit" value="Enviar"/>
            <button onclick="window.location.href = 'index.html';"  ">Voltar</button>
			</form>
			
			<form  action="algoritmo5" id="formJv5">
			<h1>Ordenação QuickShort</h1>
           	QuickShort:<input type="text" name="txtTeste"/><br>
            <input type="submit" value="Enviar"/>
            <button onclick="window.location.href = 'index.html';"  ">Voltar</button>
			</form>
			
			<form  action="algoritmo6" id="formJv6">
			<h1>Contagem Inteiro</h1>
           	N Termos:<input type="text" name="txtTeste"/><br>
           	Contagem Inteiro:<input type="text" name="txtTeste1"/><br>
            <input type="submit" value="Enviar"/>
            <button onclick="window.location.href = 'index.html';"  ">Voltar</button>
			</form>
		</div>
	<div class="container">
		<div id="ladoalado">
			<button onclick="deixarVisivel('formJv1')" class="cont">Number Primo</button>
			<button onclick="deixarVisivel('formJv2')" class="cont">Somatorio</button>
			<button onclick="deixarVisivel('formJv3')" class="cont">Fibonnaci</button>
			<button onclick="deixarVisivel('formJv4')" class="cont">MDC</button>
			<button onclick="deixarVisivel('formJv5')" class="cont">QuickSort</button>
			<button onclick="deixarVisivel('formJv6')" class="cont">Contagem Inteiro</button>
			<button onclick="window.location.href = 'index.html';" class="cont">Voltar</button>
		</div>

	</div>
	
	<script type="text/javascript">
		
		var x = "<%=request.getAttribute("txt")%>"
		if(x === "null"){
			
		}else{
			alert(x)
			var x;
		}
		
		function deixarOculto(id){
		 	document.getElementById(id).style.display = "none";
		}
		
		function deixarVisivel(id){
		 	document.getElementById(id).style.display = "inline";
		}
		
		
	</script>
</body>

</html>