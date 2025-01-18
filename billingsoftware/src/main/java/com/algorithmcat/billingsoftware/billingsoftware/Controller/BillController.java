package com.algorithmcat.billingsoftware.billingsoftware.Controller;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Bill;
import com.algorithmcat.billingsoftware.billingsoftware.Service.BillService;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    BillService billService;

    @PostMapping("/createBill")
    public ResponseEntity<String> createBill(@RequestBody RequestDto requestDto) {
        billService.saveBill(requestDto);
        return ResponseEntity.ok("Bill created successfully....!");
    }

    @GetMapping("/getBills")
    public List<Bill> getAllBills() {
        return billService.findAllBills();
    }

    @GetMapping("/getById/{billId}")
    public Bill getBillById(@PathVariable Long billId) {
        return billService.findBillById(billId);
    }

}
