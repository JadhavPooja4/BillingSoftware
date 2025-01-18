package com.algorithmcat.billingsoftware.billingsoftware.Repository;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
