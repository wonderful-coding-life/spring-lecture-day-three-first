package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("/book")
    public String getBook(Model model) {
        model.addAttribute("title", "혼자서 공부하는 자바");
        model.addAttribute("description", "풍부한 예제를 통해 공부해 보아요");
        return "book";
    }
}
