package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/customer")
    public String getCustomer(Model model) {
        model.addAttribute("contact", "customer.contact.short");
        model.addAttribute("name", "한빛미디어");
        model.addAttribute("phone", "010-2222-2222");
        return "customer";
    }
}
