/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import model.Cart;
import model.Item;
import model.User;

/**
 *
 * @author Can Duy Khanh
 */
public class OrderDAO extends DBContext {

    public void addOrder(User u, Cart cart,String name, String phone, String address, String note) {
        LocalDateTime curDate = java.time.LocalDateTime.now();
        String date = curDate.toString();
        try {
            //add vào bảng Order
            String sql = "INSERT INTO [dbo].[Orders]\n"
                    + "           ([user_id]\n"
                    + "           ,[order_date]\n"
                    + "           ,[nameO]\n"
                    + "           ,[phoneO]\n"
                    + "           ,[addressO]\n"
                    + "           ,[total_money]\n"
                    + "           ,[note])\n"
                    + "     VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, u.getId());
            st.setString(2, date);
            st.setString(3,name);
            st.setString(4,phone);
            st.setString(5,address);
            st.setDouble(6, cart.getTotalMoney());
            st.setString(7, note);
            st.executeUpdate();
            //lấy ra id của Order vừa add
            String sql1 = "select top 1 id from [Orders] order by id desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();
            //add vào bảng OrderDetails
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                    String sql2 = "INSERT INTO [dbo].[Order_Details]\n"
                            + "           ([order_id]\n"
                            + "           ,[product_id]\n"
                            + "           ,[price]\n"
                            + "           ,[numBuy])\n"
                            + "     VALUES (?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setInt(2, i.getProduct().getId());
                    st2.setDouble(3, i.getPrice());
                    st2.setInt(4, i.getQuantity());
                    st2.executeUpdate();
                }
            }
            //update so luong trong bang Product sau khi ban
            String sql3 = "update Products set stock = stock - ? "
                    + "where id = ?";
            PreparedStatement st3 = connection.prepareStatement(sql3);
            for (Item i : cart.getItems()) {
                st3.setInt(1, i.getQuantity());
                st3.setInt(2, i.getProduct().getId());
                st3.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
      public int numberOfOrder(){
        String sql=" select count(o.id) as total from Orders o ";
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
    
      public static void main(String[] args) {
          OrderDAO od = new OrderDAO();
         
          
          int sumofPro = od.numberOfOrder();
          System.out.println(sumofPro);

    }  
}
