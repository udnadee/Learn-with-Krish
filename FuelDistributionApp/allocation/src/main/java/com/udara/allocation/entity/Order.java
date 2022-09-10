package com.udara.allocation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.messaging.handler.annotation.Payload;

import javax.persistence.*;

// order class
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "Order")
public class Order {
    @Id
    private Integer orderId;
    private Integer allocAmount;
    private String status;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAllocAmount() {
        return allocAmount;
    }

    public void setAllocAmount(Integer allocAmount) {
        this.allocAmount = allocAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", allocAmount=" + allocAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
