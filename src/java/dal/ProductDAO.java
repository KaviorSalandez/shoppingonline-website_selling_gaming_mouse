/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.Category;

/**
 *
 * @author Can Duy Khanh
 */
public class ProductDAO extends DBContext {

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        String sql = " SELECT [id]\n"
                + "      ,[title]\n"
                + "      ,[price]\n"
                + "      ,[description]\n"
                + "      ,[model]\n"
                + "      ,[color]\n"
                + "      ,[stock]\n"
                + "      ,[status]\n"
                + "      ,[image]\n"
                + "      ,[category_id]\n"
                + "      ,[discount]\n"
                + "  FROM [dbo].[Products]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // lay tat ca cac ban ghi o bang Employee dua vao did(id cuar departmetn)
    public List<Product> getAllProductsByCid(int cid) {
        List<Product> list = new ArrayList<>();
        String sql = " SELECT [id]\n"
                + "      ,[title]\n"
                + "      ,[price]\n"
                + "      ,[description]\n"
                + "      ,[model]\n"
                + "      ,[color]\n"
                + "      ,[stock]\n"
                + "      ,[status]\n"
                + "      ,[image]\n"
                + "      ,[category_id]\n"
                + "      ,[discount]\n"
                + "  FROM [dbo].[Products]\n"
                + "  where 1=1 ";
        if (cid != 0) {
            sql += " and category_id=" + cid;
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            // bo qua cau lenh st
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Product> getRelatedProductByCid(int cid) {
        List<Product> listRelated = new ArrayList<>();
        String sql = "select top 3 * from Products\n"
                + "where category_id = ?\n"
                + "ORDER BY NEWID() ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, cid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                listRelated.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listRelated;
    }

    public List<Product> getSale9Product() {
        List<Product> list9 = new ArrayList<>();
        String sql = "select  top 9 * from Products where discount>=20";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list9.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list9;
    }

    //select top 5 best seller Product
    public List<Product> getTop5BestSellerProduct() {
        List<Product> listtop5bestseller = new ArrayList<>();
        String sql = "SELECt    top 5      sum(od.numBuy) as quantity  \n"
                + "      ,p.[id]\n"
                + "      ,p.[title]\n"
                + "      ,p.[price]\n"
                + "      ,p.[description]\n"
                + "      ,p.[model]\n"
                + "      ,p.[color]\n"
                + "      ,p.[stock]\n"
                + "      ,p.[status]\n"
                + "      ,p.[image]\n"
                + "      ,p.[category_id]\n"
                + "      ,p.[discount]\n"
                + "					  \n"
                + "                     FROM [Order_Details] od join  \n"
                + "                   Products p on p.id = od.product_id \n"
                + "				   group by   \n"
                + "        p.[id]\n"
                + "      ,p.[title]\n"
                + "      ,p.[price]\n"
                + "      ,p.[description]\n"
                + "      ,p.[model]\n"
                + "      ,p.[color]\n"
                + "      ,p.[stock]\n"
                + "      ,p.[status]\n"
                + "      ,p.[image]\n"
                + "      ,p.[category_id]\n"
                + "      ,p.[discount]\n"
                + "      order by quantity desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                listtop5bestseller.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listtop5bestseller;
    }

    public List<Product> getBestSaleProduct() {
        List<Product> list3 = new ArrayList<>();
        String sql = "select top 3 * from  Products p inner join Order_Details o\n"
                + "on p.id = o.product_id\n"
                + "order by  o.numBuy  desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list3.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list3;
    }

    public List<Product> getNew12Product() {
        List<Product> list12 = new ArrayList<>();
        String sql = "select top 12 * from Products order by id desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list12.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list12;
    }
///

    public Product getProductById(int id) {
        String sql = " SELECT [id]\n"
                + "      ,[title]\n"
                + "      ,[price]\n"
                + "      ,[description]\n"
                + "      ,[model]\n"
                + "      ,[color]\n"
                + "      ,[stock]\n"
                + "      ,[status]\n"
                + "      ,[image]\n"
                + "      ,[category_id]\n"
                + "      ,[discount]\n"
                + "  FROM [dbo].[Products]\n"
                + "  where id=? ";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                return p;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    //tra ve 1 danh sach cac san pham 
    //theo 1 mang id
    public List<Product> searchProduct(int[] cid) {
        List<Product> listSearch = new ArrayList<>();
        String sql = "SELECT [id]\n"
                + "      ,[title]\n"
                + "      ,[price]\n"
                + "      ,[description]\n"
                + "      ,[model]\n"
                + "      ,[color]\n"
                + "      ,[stock]\n"
                + "      ,[status]\n"
                + "      ,[image]\n"
                + "      ,[category_id]\n"
                + "      ,[discount]\n"
                + "  FROM [dbo].[Products]\n"
                + "  where 1=1 ";
        if (cid != null && cid[0] != 0) {
            sql += " and category_id in(";
            for (int i = 0; i < cid.length; i++) {
                sql += cid[i] + ",";
            }
            if (sql.endsWith(",")) {
                sql = sql.substring(0, sql.length() - 1);
            }
            sql += ")";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                listSearch.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listSearch;
    }

    public List<Product> searchProductByPrice(double from, double to) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Products\n"
                + "where price between " + from + " and " + to;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    //get All product by color
    public List<Product> searchProductByColor(String color) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT [id]\n"
                + "      ,[title]\n"
                + "      ,[price]\n"
                + "      ,[description]\n"
                + "      ,[model]\n"
                + "      ,[color]\n"
                + "      ,[stock]\n"
                + "      ,[status]\n"
                + "      ,[image]\n"
                + "      ,[category_id]\n"
                + "      ,[discount]\n"
                + "  FROM [dbo].[Products] where color = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, color);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Product> searchProductByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT [id]\n"
                + "      ,[title]\n"
                + "      ,[price]\n"
                + "      ,[description]\n"
                + "      ,[model]\n"
                + "      ,[color]\n"
                + "      ,[stock]\n"
                + "      ,[status]\n"
                + "      ,[image]\n"
                + "      ,[category_id]\n"
                + "      ,[discount]\n"
                + "  FROM [dbo].[Products] where title like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + txtSearch + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                p.setModel(rs.getString("model"));
                p.setColor(rs.getString("color"));
                p.setStock(rs.getInt("stock"));
                p.setStatus(rs.getInt("status"));
                p.setImage(rs.getString("image"));
                CategoryDAO dao = new CategoryDAO();
                Category c = dao.getCategoryById(rs.getInt("category_id"));
                p.setCategory(c);
                p.setDiscount(rs.getInt("discount"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    //delete a category
    public void deleteProduct(int id) {
        String sql = "DELETE FROM [dbo].[Products]\n"
                + "      WHERE id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            //set cho cai ?
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insert(String title, Double price, String description, String model, String color, int stock, int status, String image, int category_id, int discount) {
        String sql = "INSERT INTO [dbo].[Products]\n"
                + "           ([title]\n"
                + "           ,[price]\n"
                + "           ,[description]\n"
                + "           ,[model]\n"
                + "           ,[color]\n"
                + "           ,[stock]\n"
                + "           ,[status]\n"
                + "           ,[image]\n"
                + "           ,[category_id]\n"
                + "           ,[discount])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, title);
            st.setDouble(2, price);
            st.setString(3, description);
            st.setString(4, model);
            st.setString(5, color);
            st.setInt(6, stock);
            st.setInt(7, status);
            st.setString(8, image);
            st.setInt(9, category_id);
            st.setInt(10, discount);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update(String title, Double price, String description, String model, String color, int stock, int status, String image, int category_id, int discount, int id) {
        String sql = "UPDATE [dbo].[Products]\n"
                + "   SET [title] = ?\n"
                + "      ,[price] = ?\n"
                + "      ,[description] = ?\n"
                + "      ,[model] = ?\n"
                + "      ,[color] = ?\n"
                + "      ,[stock] = ?\n"
                + "      ,[status] = ?\n"
                + "      ,[image] = ?\n"
                + "      ,[category_id] = ?\n"
                + "      ,[discount] = ?\n"
                + " WHERE id= ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, title);
            st.setDouble(2, price);
            st.setString(3, description);
            st.setString(4, model);
            st.setString(5, color);
            st.setInt(6, stock);
            st.setInt(7, status);
            st.setString(8, image);
            st.setInt(9, category_id);
            st.setInt(10, discount);
            st.setInt(11, id);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public List<Product> getListByPage(List<Product> list, int start, int end) {
        List<Product> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

      public int numberOfProduct(){
        String sql=" select count(p.id) as total from Products p";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                int sum = rs.getInt("total");
                return sum;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }
      
        public double sumOfIncome(){
        String sql="select sum((p.price-(p.price*p.discount)/100)*od.numBuy) as total from Products p , Order_Details od where p.id =od.product_id ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                double sum = rs.getDouble("total");
                return sum;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }
      
    public static void main(String[] args) {
        ProductDAO pd = new ProductDAO();
          List<Product> listTop5ProductBestSeller = pd.getTop5BestSellerProduct();
          for (Product o : listTop5ProductBestSeller) {
              System.out.println(o.getTitle());
        }
          
          int sumofPro = pd.numberOfProduct();
          System.out.println(sumofPro);
          
           double sumofIncome = pd.sumOfIncome();
          System.out.println(sumofIncome);

    }
}
