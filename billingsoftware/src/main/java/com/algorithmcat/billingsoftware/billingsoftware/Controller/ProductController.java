package com.algorithmcat.billingsoftware.billingsoftware.Controller;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Product;
import com.algorithmcat.billingsoftware.billingsoftware.Service.ProductService;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody RequestDto requestDto) {
        System.out.println(requestDto.getRequest().get(0));
        productService.saveProduct(requestDto);
        return ResponseEntity.ok("Product Added Successfully");
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> products = productService.findAllProducts();
        System.out.println(products);
        return products;
    }







    @GetMapping("/get/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productService.findProductById(productId);
    }

}
