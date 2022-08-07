package com.kodilla.good.patterns.challenges.foodtodoor;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    // client, supplier, producer, orderDate, quantity, product, orderNo

    public OrderRequest order001(){
        DataBase dataBase = new DataBase();
        Client client = dataBase.getMonikaKuczera();
        Supplier supplier = dataBase.getKurier1();
        Producer producer = dataBase.getNewProducer();
        LocalDateTime orderDate = LocalDateTime.of(2022,8,7,0,0);
        int quantity = 2;
        Product product = new Product ("Marchewka");
        String orderNo = "001";
        return new OrderRequest(client,supplier,producer,orderDate,quantity,product,orderNo);
    }
}
