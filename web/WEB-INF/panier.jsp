<%-- 
    Document   : panier
    Created on : 2 janv. 2017, 10:16:45
    Author     : Zonthem
--%>

<%@page import="donnees.Panier"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier</title>
        <%!
            Panier p;
        %>
    </head>
    <body>
        <h1>Doit afficher le panier complet</h1>
        <p>Normalement y'a un bean à faire mais d'abord faut tester si le panier marche, après on voit
            <% 
                p = (Panier) session.getAttribute("panier");
            %>
            <%= p.toString() %>
        </p>
    </body>
</html>
