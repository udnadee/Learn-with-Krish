package com.udara.order;

public record OrderRequest(
        Integer allocAmount,
        String status) {
}
