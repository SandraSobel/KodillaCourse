package com.kodilla.good.patterns.challenges.allegro;

import org.springframework.cglib.core.Local;
import org.springframework.core.annotation.Order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository){
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;

    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(),orderRequest.getProduct());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getProduct(),orderRequest.getOrderDate(),orderRequest.getQuantity(),orderRequest.getOrderNo());
            return new OrderDto(orderRequest, true);
        }else {
            return new OrderDto(orderRequest,false);
        }

    }
}
