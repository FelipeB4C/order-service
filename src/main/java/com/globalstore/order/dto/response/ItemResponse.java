package com.globalstore.order.dto.response;

import java.math.BigDecimal;

public record ItemResponse(
        Long id,
        Integer quantity,
        BigDecimal priceAtPurchase
) {
}
