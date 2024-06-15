package com.example.calApp;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class CalController {

        @GetMapping("/")
        public String showForm() {
            return "index.html";
        }

        @PostMapping("/calculate")
        public void calculate(@RequestParam("num1") double num1,
                              @RequestParam("num2") double num2,
                              @RequestParam("operation") String operation,
                              HttpServletResponse response) throws IOException {
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
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        response.sendRedirect("/?error=Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    response.sendRedirect("/?error=Invalid operation");
                    return;
            }
            response.sendRedirect("/result.html?result=" + result);
        }

        @GetMapping("/result")
        public String showResult() {
            return "result.html";
        }
    }


