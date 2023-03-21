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
import model.User;

/**
 *
 * @author Can Duy Khanh
 */
public class UserDAO extends DBContext {
    //check tai khoan nguoi dung user

    public User check(String username, String password) {
        String sql = "SELECT [id]\n"
                + "      ,[username]\n"
                + "      ,[password]\n"
                + "      ,[name]\n"
                + "      ,[email]\n"
                + "      ,[phone_number]\n"
                + "      ,[address]\n"
                + "      ,[role_id]\n"
                + "  FROM [dbo].[Users]\n"
                + "  where [username]=? and [password]=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                User a = new User(rs.getInt("id"), username, password, rs.getString("name"), rs.getString("email"), rs.getString("phone_number"), rs.getString("address"), rs.getInt("role_id"));
                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    //check cai username day da ton tai chua????
    // neu ton tai roi tra ve true
    //chua ton tai tra ve false
    public boolean existedUser(String username) {
        String sql = "SELECT [id]\n"
                + "      ,[username]\n"
                + "      ,[password]\n"
                + "      ,[name]\n"
                + "      ,[email]\n"
                + "      ,[phone_number]\n"
                + "      ,[address]\n"
                + "      ,[role_id]\n"
                + "  FROM [dbo].[Users]\n"
                + "  where [username]=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    //change pass
    public void change(User a) {
        String sql = "UPDATE [dbo].[Users]\n"
                + "   SET [password] = ?\n"
                + "      \n"
                + " WHERE username =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getPassword());
            st.setString(2, a.getUsername());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //get All account 
    public List<User> getAllAccount() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT [id]\n"
                + "      ,[username]\n"
                + "      ,[password]\n"
                + "      ,[name]\n"
                + "      ,[email]\n"
                + "      ,[phone_number]\n"
                + "      ,[address]\n"
                + "      ,[role_id]\n"
                + "  FROM [dbo].[Users]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User a = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("name"), rs.getString("email"), rs.getString("phone_number"), rs.getString("address"), rs.getInt("role_id"));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    //delete a account
    public void deleteAccount(int id) {
        String sql = "DELETE FROM [dbo].[Users]\n"
                + "      WHERE id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            //set cho cai ?
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertAccount(String username, String password, String name, String email, String phone, String address, int role_id) {
        String sql = "INSERT INTO [dbo].[Users]\n"
                + "           ([username]\n"
                + "           ,[password]\n"
                + "           ,[name]\n"
                + "           ,[email]\n"
                + "           ,[phone_number]\n"
                + "           ,[address]\n"
                + "           ,[role_id])\n"
                + "     VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, name);
            st.setString(4, email);
            st.setString(5, phone);
            st.setString(6, address);
            st.setInt(7, role_id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //get Account by username
    public User getAccountByUserName(String username) {
        String sql = "SELECT [id]\n"
                + "      ,[username]\n"
                + "      ,[password]\n"
                + "      ,[name]\n"
                + "      ,[email]\n"
                + "      ,[phone_number]\n"
                + "      ,[address]\n"
                + "      ,[role_id]\n"
                + "  FROM [dbo].[Users]\n"
                + "  where [username]=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                User a = new User(rs.getInt("id"), username, rs.getString("password"), rs.getString("name"), rs.getString("email"), rs.getString("phone_number"), rs.getString("address"), rs.getInt("role_id"));
                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void updateAccount(String username, String password, String name, String email, String phone, String address, int role_id, int id) {
        String sql = "UPDATE [dbo].[Users]\n"
                + "   SET [username] = ?\n"
                + "      ,[password] = ?\n"
                + "      ,[name] =    ?\n"
                + "      ,[email] =?\n"
                + "      ,[phone_number] = ?\n"
                + "      ,[address] =?\n"
                + "      ,[role_id] = ?\n"
                + " WHERE id =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, name);
            st.setString(4, email);
            st.setString(5, phone);
            st.setString(6, address);
            st.setInt(7, role_id);
            st.setInt(8, id);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    ///get Accout by Id
    public User getAccountById(int id) {
        String sql = " SELECT [id]\n"
                + "      ,[username]\n"
                + "      ,[password]\n"
                + "      ,[name]\n"
                + "      ,[email]\n"
                + "      ,[phone_number]\n"
                + "      ,[address]\n"
                + "      ,[role_id]\n"
                + "  FROM [dbo].[Users]\n"
                + "  where id=?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                User u = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("name"), rs.getString("email"), rs.getString("phone_number"), rs.getString("address"), rs.getInt("role_id"));
                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<User> getListByPage(List<User> list, int start, int end) {
        List<User> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }

    public List<User> top5User() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT TOP (5) u.id\n"
                + "      ,u.[username]\n"
                + "      ,u.[password]\n"
                + "      ,u.[name]\n"
                + "      ,u.[email]\n"
                + "      ,u.[phone_number]\n"
                + "      ,u.[address]\n"
                + "      ,u.[role_id]\n"
                + "	  ,count(o.id) as[Total order] \n"
                + "  FROM Users u inner join Orders o on u.id = o.user_id\n"
                + "  group by  u.id\n"
                + "      ,u.[username]\n"
                + "      ,u.[password]\n"
                + "      ,u.[name]\n"
                + "      ,u.[email]\n"
                + "      ,u.[phone_number]\n"
                + "      ,u.[address]\n"
                + "      ,u.[role_id]\n"
                + "  order by [Total order] desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User a = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("name"), rs.getString("email"), rs.getString("phone_number"), rs.getString("address"), rs.getInt("role_id"));
                list.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public int numberOfAccount(int roleid){
        String sql=" select count(u.id) as total from Users u where u.role_id =? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, roleid);
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
        UserDAO ud = new UserDAO();
//        List<User> list = ud.top5User();
//        for (User o : list) {
//            System.out.println(o);
//        }

int sumofSUser = ud.numberOfAccount(2);
        System.out.println(sumofSUser);

    }
}
