package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.Bill;
import com.algorithmcat.billingsoftware.billingsoftware.Model.BillItem;
import com.algorithmcat.billingsoftware.billingsoftware.Model.Product;
import com.algorithmcat.billingsoftware.billingsoftware.Repository.BillItemRepository;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import com.algorithmcat.billingsoftware.billingsoftware.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BillItemServiceImpl implements BillItemService{

    @Autowired
    BillItemRepository billItemRepository;

    @Override
    public void saveBillItem(RequestDto requestDto) {

        Map<String,?> requestAttributes = requestDto.getRequest();

        Integer quantity = (Integer) requestAttributes.get("quantity");
        Double price = (Double) requestAttributes.get("price");
        String bill = (String) requestAttributes.get("bill");
        String product = (String) requestAttributes.get("product");

        BillItem billItem = new BillItem();

        billItem.setQuantity(quantity);
        billItem.setPrice(price);
        billItem.getBill();
        billItem.getProduct();

        BillItem saveBillsItems = billItemRepository.save(billItem);

        ResponseDto responseDto = new ResponseDto();
        Map<String,BillItem> map = new HashMap<>();
        map.put("BillItem",saveBillsItems);
        responseDto.setResponse(map);

    }

    @Override
    public List<BillItem> findAllBillItems() {
        return billItemRepository.findAll();
    }

    @Override
    public BillItem findBillItemById(Long id) {
        return billItemRepository.findById(id).orElse(null);
    }
}
