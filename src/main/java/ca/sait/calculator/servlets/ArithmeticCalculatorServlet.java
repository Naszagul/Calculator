/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Regan
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        System.out.println(request.getParameter("arithmetic"));
        if (request.getParameter("first")!=null){
            try{


                double first = Double.parseDouble(request.getParameter("first"));
                double second = Double.parseDouble(request.getParameter("second"));
                
                String calc = request.getParameter("calc");             
                double result;

                if(calc.equals("+")){
                    result = first + second;
                    request.setAttribute("plusColor", "rgb(75 75 75)");
                }else if(calc.equals("-")){
                    result = first - second;
                    request.setAttribute("minusColor", "rgb(75 75 75)");
                }else if(calc.equals("*")){
                    result = first * second;
                    request.setAttribute("multiplyColor", "rgb(75 75 75)");
                }else{
                    result = first / second;
                    request.setAttribute("divideColor", "rgb(75 75 75)");
                }
               
                request.setAttribute("message", String.format("Result: %s",result));
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                
            }catch(Exception e){
                request.setAttribute("message", String.format("Invalid Number"));
            }

        }else{
            request.setAttribute("message", String.format("Please enter a valid number."));
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
