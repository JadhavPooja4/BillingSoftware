package com.algorithmcat.billingsoftware.billingsoftware.Repository;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
