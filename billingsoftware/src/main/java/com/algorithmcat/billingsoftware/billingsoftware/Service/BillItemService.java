package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.BillItem;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;

import java.util.List;

public interface BillItemService {
    void saveBillItem(RequestDto requestDto);

    List<BillItem> findAllBillItems();

    BillItem findBillItemById(Long id);
}
