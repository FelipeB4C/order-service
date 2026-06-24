package com.globalstore.order.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CreateOrderRequest(
        @NotNull(message = "Customer ID cannot be blank")
        Long customerId,

        @NotEmpty(message = "Order must contain at least one item")
        @Valid
        List<ItemRequest> items
) {}