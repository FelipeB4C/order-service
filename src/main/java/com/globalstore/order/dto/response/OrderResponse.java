package com.globalstore.order.dto.response;

import java.util.List;

public record OrderResponse(
        Long orderId,
        Long customerId,
        String totalAmount,
        String status,
        String createdAt,
        List<ItemResponse> items
) {
}
