package com.kodilla.good.patterns.challenges.foodtodoor;


import com.kodilla.good.patterns.challenges.allegro.OrderRepository;

public class Aplication {
    public static void main (String [] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest001 = orderRequestRetriever.order001();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new OrderService(), new OrdersList());
        orderProcessor.process(orderRequest001);




    }

}
