<%-- 
    Document   : connexion
    Created on : 27-Dec-2016, 13:56:31
    Author     : Stephane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- La page JSP manipule des objets de type Connection et Statement -->
<%@ page import="java.sql.*" %>

<!--// DBConnexion Bean-->
<!--//Coded'initialisation//-->
<jsp:useBeanid="dbcnx" class="beans.DBConnexion">

</jsp:useBean>
<!--// DBLien Bean -->
<jsp:useBean id="dblien" class="beans.DBLien"/>
<%
// Récupération de la connexion
Connection cnx = dbcnx.getCnx();
if (cnx == null) {
out.println("<font color=red>Connexion impossible : " + cnx + "</font>");
} else {
out.println("<font color=green>Connexion établie : " + cnx + "</font>");
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
    </head>
    <body>
        <h1>Page de test de connection</h1>
    </body>
</html>
