package com.cbl.Calc;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalcController {



    @PostMapping("/index")
    public String calculate(@RequestParam double num1,
                            @RequestParam double num2,
                            @RequestParam String operation,
                            Model model) {
        double result;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) {
//                    model.addAttribute("result", "Error: Division by zero");
                	
//                    return "result";
                    return "Error Division by Zero";
                }
                result = num1 / num2;
                break;
            default:
                model.addAttribute("result", "Invalid operation");
                return "result";
        }

        model.addAttribute("result", result);
        return "result";
    }
}

