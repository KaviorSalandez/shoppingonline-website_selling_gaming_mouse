/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Can Duy Khanh
 */
public class Order {
    /*
    [id] int PRIMARY KEY IDENTITY(1, 1),
    [user_id] int,
    [order_date] datetime,
    [total_money] int,
    [note] nvarchar(255)
    */
    private int id;
    private int user_id;
    private String order_date;
    private String name;
    private String phone;
    private String address;
    private double total_money;
    private String note;

    public Order() {
    }

    public Order(int id, int user_id, String order_date, String name, String phone, String address, double total_money, String note) {
        this.id = id;
        this.user_id = user_id;
        this.order_date = order_date;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.total_money = total_money;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotal_money() {
        return total_money;
    }

    public void setTotal_money(double total_money) {
        this.total_money = total_money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    
    
    
    
}
