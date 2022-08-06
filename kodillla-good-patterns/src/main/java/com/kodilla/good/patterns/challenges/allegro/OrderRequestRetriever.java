package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("user1");
        Product product = new Product("recznik 100x30");
        LocalDateTime orderDate = LocalDateTime.of(2022,6,8,11,41);
        int quantity = 2;
        int orderNo = 12345;
        return new OrderRequest(user,product,orderDate,quantity,orderNo);


    }
}
