package com.ilya.managerapp.controller.payload;

public record UpdateProductPayload(
        String title,
        String details
) {
}