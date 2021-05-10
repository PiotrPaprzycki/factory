package com.pepe.factory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FactoryController {

    FactoryRepository factoryRepository;

    public FactoryController(FactoryRepository factoryRepository) {
        this.factoryRepository = factoryRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("factory", factoryRepository.findAll());
        return "home";
    }
}
