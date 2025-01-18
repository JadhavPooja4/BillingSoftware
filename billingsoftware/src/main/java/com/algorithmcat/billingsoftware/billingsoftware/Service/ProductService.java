package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Product;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;

import java.util.List;

public interface ProductService {
    void saveProduct(RequestDto requestDto);

    List<Product> findAllProducts();

    Product findProductById(Long productId);
}
