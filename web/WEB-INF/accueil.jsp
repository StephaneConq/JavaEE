<%-- 
    Document   : accueil
    Created on : 27-Dec-2016, 12:47:50
    Author     : Stephane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
        <!--<link href="/css/style.css" rel="stylesheet" type="text/css">-->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <form method="post" action="/connexion">
            <fieldset>
                <legend>Connexion</legend>
                <p>
                    <label for="nom">Nom : </label><input name="nom" type="text" id="pseudo" /><br />
                    <label for="password">Mot de Passe : </label><input type="password" name="password" id="password" />
                </p>
                <p><input type="submit" value="Connexion" /></p></fieldset></form><br>
        <form method="get" action="session">
            <fieldset>
                <button type="submit" name="action" value="clear">Vider Panier</button><br>
                <button type="submit" name="action" value="consulter">Consulter Panier</button><br>
            </fieldset>
        </form>
        <div>
            <form action="session" method="get">
                <img src="imgs\dead_space.jpg"><br>
                <p><h2>Dead Space 2</h2></p>
                <label><button type="submit" name="ajout" value="dead_space">Ajouter au panier</button></label><br>
                <img src="imgs\demon_souls.jpg"><br>
                <p><h2>GTA V</h2></p><br>
                <label><button type="submit" name="ajout" value="gta">Ajouter au panier</button></label>  <br> 
                <img src="imgs\gta.jpg"><br>
                <p><h2>Demons Souls</h2></p><br>
                <label><button type="submit" name="ajout" value="demon_souls">Ajouter au panier</button></label><br>
                <img src="imgs\virtua_tennis.jpg"><br>
                <p><h2>Virtual Tennis 4</h2></p><br>
                <label><button type="submit" name="ajout" value="virtua_tennis">Ajouter au panier</button></label><br>
            </form>
        </div>

    </body>
</html>
