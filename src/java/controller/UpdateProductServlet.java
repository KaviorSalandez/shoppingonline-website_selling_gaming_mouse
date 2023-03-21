/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Can Duy Khanh
 */
@WebServlet(name="UpdateServlet", urlPatterns={"/updateProduct"})
public class UpdateProductServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String id_raw = request.getParameter("pid");
        String title = request.getParameter("title");
        String price_raw = request.getParameter("price");
        String description = request.getParameter("description");
        String model = request.getParameter("model");
        String color = request.getParameter("color");
        String stock_raw = request.getParameter("stock");
        String status_raw = request.getParameter("status");
        String image = request.getParameter("image");
        String categoryID_raw = request.getParameter("category");
        String discount_raw = request.getParameter("discount");
        ProductDAO pd = new ProductDAO();
        double price;
        int stock;
        int categoryID;
        int discount;
        int status;
        int id;
        try {
            id = Integer.parseInt(id_raw);
            price = Double.parseDouble(price_raw);
            stock = Integer.parseInt(stock_raw);
            status= Integer.parseInt(status_raw);
            categoryID= Integer.parseInt(categoryID_raw);
            discount = Integer.parseInt(discount_raw);
            pd.update(title, price, description, model, color, stock, status, image, categoryID, discount, id);
            response.sendRedirect("manage");
            
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
