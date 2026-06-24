package com.globalstore.order.service;

import com.globalstore.order.dto.request.CreateOrderRequest;
import com.globalstore.order.dto.request.ItemRequest;
import com.globalstore.order.mapper.OrderMapper;
import com.globalstore.order.model.Order;
import com.globalstore.order.model.Product;
import com.globalstore.order.repository.OrderRepository;
import com.globalstore.order.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository, OrderMapper orderMapper){
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
        this.orderMapper = orderMapper;
    }

    @Transactional
    public ResponseEntity<Void> createOrder(CreateOrderRequest orderRequest) {

        List<Long> productsIds = orderRequest.items().stream().map(ItemRequest::productId).toList();
        Map<Long, Product> productsMap = productRepository.findAllById(productsIds).stream().collect(Collectors.toMap(Product::getId, Function.identity()));

        Order orderEntity = orderMapper.toEntity(orderRequest);
        orderEntity.closeOrder(productsMap);
        orderRepository.save(orderEntity);
        return ResponseEntity.noContent().build();
    }


}
