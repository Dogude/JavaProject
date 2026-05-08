package com.example.firstrestapi.shared.api.response;

import com.example.firstrestapi.product.api.request.UpdateProductRequest;
import com.example.firstrestapi.product.api.response.ProductResponse;
import com.example.firstrestapi.product.domain.Product;
import com.example.firstrestapi.product.support.ProductExceptionSupplier;

public class ErrorMessageResponse {


    private final String message;


    public ErrorMessageResponse(String message) {
        this.message = message;

    }

    public String getMessage () {
        return message;

    }

}
