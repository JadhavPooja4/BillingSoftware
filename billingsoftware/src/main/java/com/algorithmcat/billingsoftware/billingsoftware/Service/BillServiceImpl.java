package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Bill;
import com.algorithmcat.billingsoftware.billingsoftware.Repository.BillRepository;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import com.algorithmcat.billingsoftware.billingsoftware.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BillServiceImpl implements BillService{

    @Autowired
    BillRepository billRepository;

    @Override
    public void saveBill(RequestDto requestDto) {

        Map<String,?> requestAttributes = requestDto.getRequest();

        Double totalAmount = (Double) requestAttributes.get("totalAmount");
        String createdAt = (String) requestAttributes.get("createdAt");

        Bill bill = new Bill();
        bill.setCreatedAt(createdAt);
        bill.setTotalAmount(totalAmount);

        Bill saveBills = billRepository.save(bill);

        ResponseDto responseDto = new ResponseDto();
        Map<String,Bill> map = new HashMap<>();
        map.put("Bill",saveBills);
        responseDto.setResponse(map);

    }

    @Override
    public List<Bill> findAllBills() {
        return billRepository.findAll();
    }

    @Override
    public Bill findBillById(Long billId) {
        return billRepository.findById(billId).orElse(null);
    }
}
