package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Bill;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;

import java.util.List;

public interface BillService {
    void saveBill(RequestDto requestDto);

    List<Bill> findAllBills();

    Bill findBillById(Long billId);
}
