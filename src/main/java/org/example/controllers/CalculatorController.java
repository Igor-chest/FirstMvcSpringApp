package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    String a = "";
    String b = "";
    String action = "";

    @GetMapping("/result")
    public String resultPage(@RequestParam(value = "a", required = false) String a,
                             @RequestParam(value = "b", required = false) String b,
                             @RequestParam(value = "action", required = false) String action,
                             Model model) {

        model.addAttribute("result", "result: " + calc(a, b, action));

        return "/calculator/result";
    }

    private double calc(String a, String b, String action) {
        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);

        if (action.equals("multiplication")) {
            return ia*ib;
        }
        if (action.equals("addition")) {
            return ia+ib;
        }
        if (action.equals("subtraction")) {
            return ia-ib;
        }
        return ia/(double)ib; // (division)
    }

}
