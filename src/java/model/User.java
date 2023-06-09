/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Can Duy Khanh
 */
public class User {
    /*
     [id] int identity(1,1) PRIMARY KEY,
    [username] nvarchar(255),
    [password] nvarchar(255),
    [name] nvarchar(255),
    [email] nvarchar(255),
    [phone_number] nvarchar(255),
    [address] nvarchar(255),
    [role_id] int
    */
    private int id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone_number;
    private String address;
    private int role_id;

    public User() {
    }

    public User(int id, String username, String password, String name, String email, String phone_number, String address, int role_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.role_id = role_id;
    }
    public User(String username, String password, String name, String email, String phone_number, String address, int role_id){
         this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.role_id = role_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", email=" + email + ", phone_number=" + phone_number + ", address=" + address + ", role_id=" + role_id + '}';
    }

   

    
    
    
}
