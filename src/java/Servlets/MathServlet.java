/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas Silva
 */
@WebServlet(name = "MathServlet", urlPatterns = {"/math.html"})
public class MathServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MathServlet</title>");            
            out.println("</head>");
            out.println("<body>");            
            double numero1, numero2 = 0;
            try{
                numero1 = Double.parseDouble(request.getParameter("numero1"));
                numero2 = Double.parseDouble(request.getParameter("numero2"));
                out.println("<h3>Soma</h3>"); 
                out.println("<h4>"+numero1+" + "+numero2+" = "+(numero1+numero2)+"</h4>");
                out.println("<h3>Subtração</h3>");
                out.println("<h4>"+numero1+" - "+numero2+" = "+(numero1-numero2)+"</h4>");
                out.println("<h3>Divisão</h3>");
                out.println("<h4>"+numero1+" / "+numero2+" = "+(numero1/numero2)+"</h4>");
                out.println("<h3>Multiplicação</h3>");
                out.println("<h4>"+numero1+" * "+numero2+" = "+(numero1*numero2)+"</h4>");
                out.println("<button><a href='index.html' >Voltar</a></button>");
            }catch(NumberFormatException ex){
                out.println("<p style='color:red'>Erro ao ler parâmetros: "+ex.getMessage()+"<p>");
                out.println("<button><a href='index.html' >Voltar</a></button>");
            }
            out.println("</body>");
            out.println("</html>");
        }
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

}
