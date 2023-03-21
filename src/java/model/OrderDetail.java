/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Can Duy Khanh
 */
public class OrderDetail {
    /*
    [id] int PRIMARY KEY,
    [order_id] int,
    [product_id] int,
    [price] double,
    [numBuy] int
    */
    private int id;
    private int order_id;
    private int product_id;
    private double price;
    private int numBuy;

    public OrderDetail() {
    }

    public OrderDetail(int id, int order_id, int product_id, double price, int numBuy) {
        this.id = id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.price = price;
        this.numBuy = numBuy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumBuy() {
        return numBuy;
    }

    public void setNumBuy(int numBuy) {
        this.numBuy = numBuy;
    }
    
    
    
}
