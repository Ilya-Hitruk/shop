package com.ilya.catalogservice.controller.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UpdateProductPayload(
        @NotEmpty(message = "{catalog.products.update.title_is_null}")
        @NotNull(message = "{catalog.products.update.title_is_null}")
        @Size(min = 3, max = 50, message = "{catalog.products.update.title_size_is_invalid}")
        String title,
        @Size(max = 1000, message = "{catalog.products.update.details_size_is_invalid}")
        String details
) {
}