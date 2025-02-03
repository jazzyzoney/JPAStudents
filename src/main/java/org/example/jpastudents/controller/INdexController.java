package org.example.jpastudents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class INdexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
