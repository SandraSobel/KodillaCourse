package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {
    public User user;
    public Product product;
    public LocalDateTime orderDate;
    public int quantity;
    public int orderNo;
    public OrderRequest(final User user, final Product product, final LocalDateTime orderDate,final int quantity, final int orderNo){
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.orderNo = orderNo;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {

        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderNo() {
        return orderNo;
    }
}
