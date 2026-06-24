package com.globalstore.order.model;

import com.globalstore.order.enums.OrderStatus;
import com.globalstore.order.exception.DomainException;
import jakarta.persistence.*;
import lombok.*;
import org.apache.kafka.common.errors.ResourceNotFoundException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "tb_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private OrderStatus status;

    @Column(name = "total_amount", nullable = false, precision = 12, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        if(this.status == null) {
            this.status = OrderStatus.PENDING;
        }
    }

    public void closeOrder(Map<Long, Product> productsFromDb) {
        if (this.items == null || this.items.isEmpty()) {
            throw new DomainException("Cannot close an empty order");
        }

        BigDecimal total = BigDecimal.ZERO;

        for (OrderItem item : this.items) {
            Product product = productsFromDb.get(item.getProduct().getId());

            if (product == null) {
                throw new DomainException("Product not found or unavailable: " + item.getProduct().getId());
            }

            item.setProduct(product);
            item.setPriceAtPurchase(product.getCurrentPrice());

            total = total.add(item.getSubTotal());
        }

        this.totalAmount = total;
    }
}