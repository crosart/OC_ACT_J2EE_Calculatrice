<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculatrice</title>
	</head>

	<body>
		
		<p>	Quelle opération souhaitez vous réaliser ?</p>
			<form name="calc" method="post">
				Votre opération :&nbsp<input type="text" name="arg1" id="arg1"/>&nbsp
				<select name="operande" id="operande">
					<option value="add">+</option>
					<option value="substract">-</option>
					<option value="multiply">x</option>
					<option value="modulo">%</option>
				</select>
				&nbsp<input type="text" name="arg2" id="arg2" />&nbsp&nbsp<input type="submit" value="Calculer" />
			</form>

<!-- Prise en compte de l'état initial au chargement de la page et de l'affichage du résultat si une requête a été effectuée -->

		<p>La réponse à votre calcul est ${ status ? result : 'inconnu pour le moment !' }</p>
	</body>
</html>