package com.algorithmcat.billingsoftware.billingsoftware.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlAccessController {

    @GetMapping("/")
    public String homePage(){

        return "home";
    }

    @GetMapping("/htmlProducts")
    public String productsPage(){
        return "products";
    }

    @GetMapping("/htmlBills")
    public String billsPage() {
        return "bills"; // Returns bills.html
    }

}
