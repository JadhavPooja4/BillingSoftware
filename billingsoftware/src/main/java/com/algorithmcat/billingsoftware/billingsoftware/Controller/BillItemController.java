package com.algorithmcat.billingsoftware.billingsoftware.Controller;

import com.algorithmcat.billingsoftware.billingsoftware.Model.BillItem;
import com.algorithmcat.billingsoftware.billingsoftware.Service.BillItemService;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillItemController {

    @Autowired
    BillItemService billItemService;

    @PostMapping("/createBillItem")
    public ResponseEntity<String> createBillItem(@RequestBody RequestDto requestDto) {
        billItemService.saveBillItem(requestDto);
        return ResponseEntity.ok("Bill item created successfully....!");
    }

    @GetMapping("/getAllBillItems")
    public List<BillItem> getAllBillItems() {
        return billItemService.findAllBillItems();
    }

    @GetMapping("getBillItemById/{id}")
    public BillItem getBillItemById(@PathVariable Long id) {
        return billItemService.findBillItemById(id);
    }

}
