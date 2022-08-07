package com.kodilla.good.patterns.challenges.foodtodoor;



public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrdersList ordersList;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrdersList ordersList){
        this.informationService = informationService;
        this.orderService = orderService;
        this.ordersList = ordersList;
    }
    public OrderDTO process(OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getClient(),orderRequest.getProduct());
        if (isOrdered) {
            informationService.inform(orderRequest);
            ordersList.createOrder(orderRequest.getClient(), orderRequest.getSupplier(), orderRequest.getProducer(), orderRequest.getOrderDate(), orderRequest.getQuantity(), orderRequest.getProduct(), orderRequest.getOrderNo());
            return new OrderDTO(orderRequest, true);
        }else{
            return new OrderDTO(orderRequest, false);

        }
    }
}
