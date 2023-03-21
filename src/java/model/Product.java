/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Can Duy Khanh
 */
public class Product {
    /*
    [id] int PRIMARY KEY,
    [title] nvarchar(255),
    [price] decimal,
    [description] nvarchar(2000),
    [model] nvarchar(255),
    [color] nvarchar(255),
    [stock] int,//so luong san pham trong kho
    [status] int,
    [image] nvarchar(255),
    [category_id] int,
    [discount] int
    */
    
    private int id;
    private String title;
    private double price;
    private String description;
    private String model;
    private String color;
    private int stock;
    private int status;
    private String image;
    private Category category;
    private int  discount;

    public Product() {
    }

    public Product(int id, String title, double price, String description, String model, String color, int stock, int status, String image, Category category, int discount) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.model = model;
        this.color = color;
        this.stock = stock;
        this.status = status;
        this.image = image;
        this.category = category;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", title=" + title + ", price=" + price + ", description=" + description + ", model=" + model + ", color=" + color + ", stock=" + stock + ", status=" + status + ", image=" + image + ", category=" + category.getId() + ", discount=" + discount + '}';
    }
    
    
    
    
}
