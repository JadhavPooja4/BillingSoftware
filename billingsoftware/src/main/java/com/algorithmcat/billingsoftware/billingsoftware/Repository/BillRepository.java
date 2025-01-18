package com.algorithmcat.billingsoftware.billingsoftware.Repository;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}
