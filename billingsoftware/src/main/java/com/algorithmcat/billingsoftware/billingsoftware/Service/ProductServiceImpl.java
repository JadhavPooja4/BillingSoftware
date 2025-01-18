package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Product;
import com.algorithmcat.billingsoftware.billingsoftware.Model.User;
import com.algorithmcat.billingsoftware.billingsoftware.Repository.ProductRepository;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import com.algorithmcat.billingsoftware.billingsoftware.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override



    public void saveProduct(RequestDto requestDto) {



        Map<String,?> requestAttribute = requestDto.getRequest();

        String name = (String) requestAttribute.get("name");
        Double price = (Double) requestAttribute.get("price");
        Integer stockQuantity = (Integer) requestAttribute.get("stockQuantity");

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setStockQuantity(stockQuantity);

        Product saveProducts = productRepository.save(product);

        ResponseDto responseDto = new ResponseDto();
        Map<String,Product> map = new HashMap<>();
        map.put("Product",saveProducts);
        responseDto.setResponse(map);

    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }
}
