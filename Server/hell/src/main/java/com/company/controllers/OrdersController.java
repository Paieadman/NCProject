package com.company.controllers;
import com.company.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
public class OrdersController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/orders")
    public String getOrders(){
        return "order";
    }
}
