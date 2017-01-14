<%-- 
    Document   : connexion
    Created on : 27-Dec-2016, 13:56:31
    Author     : Stephane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- La page JSP manipule des objets de type Connection et Statement -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
    </head>
    <body>
        <h1>Echec de la connection : identifiants incorrects</h1>
        <form method="post" action="/connexion">
            <fieldset>
                <legend>Connexion</legend>
                <p>
                    <label for="nom">Nom : </label><input name="nom" type="text" id="pseudo" /><br />
                    <label for="password">Mot de Passe : </label><input type="password" name="password" id="password" />
                </p>
                <p><input type="submit" value="Connexion" /></p></fieldset></form>
    </body>
</html>
