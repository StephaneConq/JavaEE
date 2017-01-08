/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import donnees.Panier;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

/**
 *
 * @author Zonthem
 */
@WebServlet(name = "GestionnaireSession", urlPatterns = {"/session"})
public class GestionnaireSession extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Panier p;
        HttpSession session = request.getSession(true);
        if (session.getAttribute("panier")==null) {
            //generation du cookie
            Cookie c = new Cookie("id", session.getId());
            c.setMaxAge(3600*24);
            response.addCookie(c);
            //creation et recuperation du panier
            session.setAttribute("panier", new Panier());
            System.out.println("Création d'un panier pour : " + session.getId());
        }
        p = (Panier) session.getAttribute("panier");
        
        //Ici gerer l'operation relative au panier (ajout/suppression/consultation)
        try {
            if (request.getParameter("ajout") != null) {
                p.addToPanier(request.getParameter("ajout"));
                System.out.print("objet ajoute");
                response.sendRedirect("/accueil");
            } else if (request.getParameter("action") != null) {
                if (request.getParameter("action").equals("clear")) {
                    p.viderPanier();
                    response.sendRedirect("/accueil");
                } else if (request.getParameter("action").equals("consulter"))
                    this.getServletContext().getRequestDispatcher("/WEB-INF/panier.jsp").forward(request, response);
            }
        } catch(NullPointerException e) {
            System.err.println("le panier n'est pas référencé. ID session : " + session.getId());
            System.err.println(session.getAttribute("panier"));
        }
        //puis revenir à la page d'accueil (ou la consultation du panier le cas echeant)
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void clearSession(HttpServletRequest request, HttpServletResponse response) {
        request.getSession(true).invalidate();
    }
}
