package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrderRepository {
    public ArrayList<OrderRequest> listOfOrders = new ArrayList<>();
    public void createOrder(User user, Product product, LocalDateTime orderDate, int quantity, int orderNo){
        listOfOrders.add(new OrderRequest(user,product,orderDate,quantity,orderNo));
    }
    public ArrayList<OrderRequest> getListOfOrders() {
        return listOfOrders;
    }
}
