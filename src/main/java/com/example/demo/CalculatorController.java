package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam int num1,
            @RequestParam int num2,
            @RequestParam String operation,
            Model model) {

        int result = 0;

        switch (operation) {
            case "add": result = num1 + num2; break;
            case "sub": result = num1 - num2; break;
            case "mul": result = num1 * num2; break;
            case "div": result = num1 / num2; break;
        }

        model.addAttribute("result", "Result: " + result);
        return "index";
    }
}
