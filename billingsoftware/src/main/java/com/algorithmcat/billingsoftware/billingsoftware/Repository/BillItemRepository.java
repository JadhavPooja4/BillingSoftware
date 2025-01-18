package com.algorithmcat.billingsoftware.billingsoftware.Repository;

import com.algorithmcat.billingsoftware.billingsoftware.Model.BillItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillItemRepository extends JpaRepository<BillItem,Long> {
}
