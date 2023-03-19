package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello") // при переходе по адресу вызывается метод
    public String helloPage() {
        return "first/hello";
    }

    @GetMapping("/goodbye") // при переходе по адресу вызывается метод
    public String goodByePage() {
        return "first/goodbye";
    }
}
