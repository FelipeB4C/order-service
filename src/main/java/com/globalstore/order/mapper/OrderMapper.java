package com.globalstore.order.mapper;

import com.globalstore.order.dto.request.CreateOrderRequest;
import com.globalstore.order.model.Order;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "id", ignore = true)
    Order toEntity(CreateOrderRequest orderRequest);

    @AfterMapping
    default void linkOrderItems(@MappingTarget Order order) {
        if (order.getItems() != null) {
            order.getItems().forEach(item -> item.setOrder(order));
        }
    }

}
