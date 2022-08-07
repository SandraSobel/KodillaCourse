package com.kodilla.good.patterns.challenges.foodtodoor;


public class OrderDTO {
    OrderRequest orderRequest;
    public boolean isOrdered;

    public OrderDTO(OrderRequest orderRequest,boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }
}