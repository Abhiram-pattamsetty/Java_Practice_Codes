package com.kishore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	
	@GetMapping("/")
	public String showForm()
	{return "kish";}
	
    @PostMapping("/calc")
    public String calculate(@RequestParam double num1,
                            @RequestParam double num2,
                            @RequestParam String operation,
                            Model model) {
//    public String calculate(Model model) {
//    	double num1=23;
//    	double num2=12;
//    	String operation="add";
        double result=0;
        int evm=10;

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
                	evm=20;
//                    model.addAttribute("result", "Error: Division by zero");
                	model.addAttribute("akki"," operation not possible");
//                    return "index";
                }
                else {
                result = num1 / num2;
                break;
                }
//            default:
//                model.addAttribute("result", "Invalid operation");
//                evm=1;
//                return "result";
        }
    	model.addAttribute("evm", evm);

        model.addAttribute("result", result);
        
        return "index";
    }
}
