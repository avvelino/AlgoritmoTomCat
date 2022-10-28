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
			<form  action="teste" id="formJv">
			<h1>Numero Primo</h1>
            Teste:<input type="text" name="txtTeste"/><br>
            <input type="submit" value="Enviar"/>
            <button onclick="window.location.href = 'index.html';"  ">Voltar</button>
			</form>
		</div>
	<div class="container">
		<div id="ladoalado">
			<button onclick="deixarVisivel('formJv')" class="cont">Number Primo</button>
			<button onclick="" class="cont">Somatorio</button>
			<button onclick="" class="cont">Fibonnaci</button>
			<button onclick="" class="cont">MDC</button>
			<button onclick="" class="cont">QuickSort</button>
			<button onclick="" class="cont">Contagem Inteiro</button>
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