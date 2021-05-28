package com.pepe.factory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/factories")
    public String secret() {
        return "factories";
    }

    @GetMapping("/loginform")
    public String loginForm() {
        return "login_form";
    }
}