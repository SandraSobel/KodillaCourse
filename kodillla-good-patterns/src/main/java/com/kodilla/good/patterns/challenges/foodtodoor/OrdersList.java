package com.kodilla.good.patterns.challenges.foodtodoor;



import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdersList {

    public ArrayList<OrderRequest> listOfOrders = new ArrayList<>();
    public void createOrder(Client client, Supplier supplier, Producer producer, LocalDateTime orderDate, int quantity, Product product, String orderNo){
        listOfOrders.add(new OrderRequest(client,supplier,producer,orderDate,quantity,product,orderNo));

    }

    public ArrayList<OrderRequest> getListOfOrders() {
        return listOfOrders;
    }
}
