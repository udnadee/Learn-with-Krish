package com.udara.allocation;

public record UpdateStockmessage(
        Integer availableStock,
        Integer allocatedAmount) {
}