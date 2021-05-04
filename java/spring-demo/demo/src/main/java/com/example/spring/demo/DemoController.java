package com.example.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/demo")
    public String get() {
        return "demo";
    }
}
