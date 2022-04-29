package com.example.sweetcorner.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order-delivery")
public class OrderDeliveryController {

    @GetMapping
    public String getOrderDeliveryPage(Model model) {
        model.addAttribute("bodyContent", "order-delivery");
        return "master-template";
    }

}
