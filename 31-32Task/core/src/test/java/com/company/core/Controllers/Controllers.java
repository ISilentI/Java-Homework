package com.company.core.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Controllers {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}