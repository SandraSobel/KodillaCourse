package com.kodilla.good.patterns.challenges.foodtodoor;

import java.time.LocalDateTime;

public class OrderRequest {
    public Client client;
    public Supplier supplier;
    public Producer producer;
    public LocalDateTime orderDate;
    public int quantity;
    public Product product;
    String orderNo;

    public OrderRequest(Client client, Supplier supplier, Producer producer, LocalDateTime orderDate, int quantity, Product product, String orderNo) {
        this.client = client;
        this.supplier = supplier;
        this.producer = producer;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.product = product;
        this.orderNo = orderNo;
    }

    public Client getClient() {
        return client;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Producer getProducer() {
        return producer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
    public String getOrderNo(){
        return orderNo;
    }
}
