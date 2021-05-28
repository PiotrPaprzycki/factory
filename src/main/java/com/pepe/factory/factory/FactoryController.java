package com.pepe.factory.factory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FactoryController {

    FactoryRepository factoryRepository;

    public FactoryController(FactoryRepository factoryRepository) {
        this.factoryRepository = factoryRepository;
    }

    @GetMapping("/factories")
    public String home(Model model) {
        model.addAttribute("factory", factoryRepository.findAll());
        return "factories";
    }

}
