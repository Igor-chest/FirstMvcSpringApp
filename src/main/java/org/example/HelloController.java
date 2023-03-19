package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world123")  // при переходе по адресу вызывается метод
    public String sayHello() {
        return "I know";
    }
}
