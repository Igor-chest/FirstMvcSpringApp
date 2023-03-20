package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")  // меняет переход в имеющихся здесь GetMapping (теперь нужно в адресной строке вбивать это перед разделом)
public class FirstController {
    @GetMapping("/hello") // при переходе по адресу вызывается метод
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println(name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye") // при переходе по адресу вызывается метод
    public String goodByePage() {
        return "first/goodbye";
    }
}
