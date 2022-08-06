package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderDto {
    OrderRequest orderRequest;
    public boolean isOrdered;
    public OrderDto(final OrderRequest orderRequest, final boolean isOrdered){
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;

    }
}
