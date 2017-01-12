<%-- 
    Document   : inscription
    Created on : 11 janv. 2017, 10:48:46
    Author     : Stephane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Vous voulez vous inscrire ?</h1>
        <form method="post" action="servlets/Connexion">
	<fieldset>
	<legend>Inscription</legend>
	<p>
            <label for="nom">Nom : </label><input name="nom" type="text" id="pseudo" /><br />
            <label for="prenom">Prenom : </label><input name="prenom" type="text" id="prenom" /><br />
            <label for="login">Login : </label><input name="login" type="text" id="login" /><br />
            <label for="password">Mot de Passe : </label><input type="password" name="password" id="password" />
	</p>
        <p><input type="submit" value="Inscription" /></p></fieldset></form><br>
    </body>
</html>
