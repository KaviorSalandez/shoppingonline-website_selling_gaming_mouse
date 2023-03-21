/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;
import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Product;

/**
 *
 * @author Can Duy Khanh
 */
@WebServlet(name="ShopSearchProductsServlet", urlPatterns={"/shop1"})
public class Shop1Servlet extends HttpServlet {
   
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListProductsServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListProductsServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
//        String cid_raw = request.getParameter("cid");
//        int cid;
//        try {
//            cid = Integer.parseInt(cid_raw);
//            ProductDAO pd = new ProductDAO();
//            List<Product> listp = pd.getAllProductsByCid(cid);
//            request.setAttribute("products", listp);
//        } catch (NumberFormatException e) {
//            System.out.println(e);
//        }
        
        
        CategoryDAO cd = new CategoryDAO();
        ProductDAO pd = new ProductDAO();
        List<Category> listC = cd.getAllCategory();
        List<Product> products = new ArrayList<>();
        //tim kiem theo ten 
        String key = request.getParameter("key");
        if(key != null){
            products =pd.searchProductByName(key);
        } 
        //day len de lay gia tri true false
        boolean[] cate = new boolean[listC.size() + 1];
        String cid_raw = request.getParameter("cid");
        
        //llay ra mot mang id cua category trong checkbox
        String[] cidd_raw = request.getParameterValues("cidd");
        //de convert mang boolean ve int
        int[] cidd = null;

        
        
        
        //lay ra product theo cid
        int cid = 0;
        if (cid_raw != null) {
            cid = Integer.parseInt(cid_raw);
            products = pd.getAllProductsByCid(cid);
            if (cid == 0) {
                cate[0] = true;
            }
        }
        //lay ra danh sach san pham theo cid checkbox
        if (cidd_raw != null) {
            cidd = new int[cidd_raw.length];
            for (int i = 0; i < cidd.length; i++) {
                cidd[i] = Integer.parseInt(cidd_raw[i]);
            }
            products = pd.searchProduct(cidd);
        }
        //lay ra mang cac gia tri price
        String[] pp = {"Under $100", "$100 to 200$", "$200 & Above"};
        
        boolean[] pb = new boolean[pp.length + 1];
        String[] price = request.getParameterValues("price");
        
        if (price != null) {
            double from = 0, to = 0;
            for (int i = 0; i < price.length; i++) {
                List<Product> temp = new ArrayList<>();
                if (price[i].equals("0")) {
                    from = 0;
                    to = 999999;
                    products = pd.searchProductByPrice(from, to);
                    pb[0] = true;
                    break;
                } else {
                    if (price[i].equals("1")) {
                        from = 0;
                        to = 100;
                        temp = pd.searchProductByPrice(from, to);
                        products.addAll(temp);
                        pb[1] = true;
                    }
                    if (price[i].equals("2")) {
                        from = 100;
                        to = 200;
                        temp = pd.searchProductByPrice(from, to);
                        products.addAll(temp);
                        pb[2] = true;
                    }
                    if (price[i].equals("3")) {
                        from = 200;
                        to = 999999;
                        temp = pd.searchProductByPrice(from, to);
                        products.addAll(temp);
                        pb[3] = true;
                    }
                }
            }
        }
        String color = request.getParameter("searchColor");
        if(color != null){
            products =pd.searchProductByColor(color);
        }
        //ko chon price thi mac dinh ve all
        if (price == null) {
            pb[0] = true;
        }
        if (cid_raw == null) {
            cate[0] = true;
        }
        if ((cidd_raw != null) && (cidd[0] != 0)) {
            cate[0] = false;
            for (int i = 1; i < cate.length; i++) {
                if (ischeck(listC.get(i - 1).getId(), cidd)) {
                    cate[i] = true;
                } else {
                    cate[i] = false;
                }
            }
        }
        if (cidd_raw ==null && cid_raw == null  && price == null && key ==null && color == null) {
             products = pd.getAllProducts();
        }
        
        
//        String color = request.getParameter("colors");
//        products  = pd.searchProductByColor(color);
     
            
        
        request.setAttribute("key", key);
        request.setAttribute("category", listC);
        request.setAttribute("products", products);
        request.setAttribute("pp", pp);
        request.setAttribute("pb", pb);
        request.setAttribute("cid", cid);
        request.setAttribute("cate", cate);
        request.setAttribute("color", color);
        request.getRequestDispatcher("shop.jsp").forward(request, response);
    }
    //de checkk xem cai nao dc check
    private boolean ischeck(int d, int[] id) {
        if (id == null) {
            return false;
        } else {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == d) {
                    return true;
                }
            }
            return false;
        }
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
        processRequest(request, response);
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
