package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")  // меняет переход в имеющихся здесь GetMapping (теперь нужно в адресной строке вбивать это перед разделом)
public class FirstController {
    @GetMapping("/hello") // при переходе по адресу вызывается метод
    public String helloPage(@RequestParam(value = "name", required = false) String name, // передача параметров клиентом в адресной строке
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        //System.out.println(name + " " + surname);
        model.addAttribute("message", name + " " + surname); // модель, которую отправим в представление пользователю

        return "first/hello";
    }

    @GetMapping("/goodbye") // при переходе по адресу вызывается метод
    public String goodByePage() {
        return "first/goodbye";
    }
}
