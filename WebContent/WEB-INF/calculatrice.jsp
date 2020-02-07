<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculatrice</title>
	</head>

	<body>
	
		<%
			
		%>
	
		<p>	Quelle opération souhaitez vous réaliser ?</p>
			<ul>
				<li><a href="/OC_ACT_J2EE_Calculatrice/calculatrice?operande=addition">Addition</a></li>
				<li><a href="/OC_ACT_J2EE_Calculatrice/calculatrice?operande=soustraction">Soustraction</a></li>
				<li><a href="/OC_ACT_J2EE_Calculatrice/calculatrice?operande=multiplication">Multiplication</a></li>
				<li><a href="/OC_ACT_J2EE_Calculatrice/calculatrice?operande=modulo">Division [Modulo]</a></li>
			</ul>
				
				
				
			<form name="calc" method="post" action="Calculatrice">
				Votre opération :&nbsp<input type="text" name="arg1" id="arg1"/>&nbsp+&nbsp<input type="text" name="arg2" id="arg2" />&nbsp&nbsp<input type="submit" value="Calculer" />
			</form>
		
		<p>La réponse à votre calcul est ${ result }</p>
	</body>
</html>