<%-- 
    Document   : accueil
    Created on : 27-Dec-2016, 12:47:50
    Author     : Stephane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- La page JSP manipule des objets de type Connection et Statement -->
<%@ page import="java.sql.*" %>
<!--// DBConnexion Bean-->
<jsp:useBean id="dbcnx" class="beans.DBConnexion">
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
                        <a href="inscription.jsp">Pas encore inscrit ?</a>
                    </p>
                    <p><input type="submit" value="Connexion" /></p></fieldset>
            </form><br>
            <form method="get" action="session">
                <fieldset>
                    <button type="submit" name="action" value="clear">Vider Panier</button><br>
                    <button type="submit" name="action" value="consulter">Consulter Panier</button><br>
                </fieldset>
            </form>
            <div>
                <jsp:useBean id="dblien" class="beans.DBLien"/>
                
                <form action="session" method="get">
                    <%
                    //préparation de la requête
                    
                    String commande = "select * from jeu_java";
                    ResultSet rs;
                    rs = lien.exeuteQuery(commande);
                    If(rs != null)
                    {
                        while (rs.next()) {
                            out.println("<a href=\""+rs.getFloat("JEU_IMG")+"\" alt=img "+rs.getString("JEU_NOM")+"><br>");
                            out.println(rs.getString("JEU_NOM")+"<br>");
                            out.println(rs.getFloat("JEU_PRIX")+"<br>");
                            out.println("<label><button type=\"submit\" name=\"ajout\" value=\""+rs.getString("JEU_NOM")+"\">Ajouter au panier</button></label><br>");
                        }
                %>
                </form>
            </div>

        </body>
    </html>
