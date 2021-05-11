package com.pepe.factory.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class ProductController {

    ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/{id}")
    public String factory(Model model, @PathVariable Long id) { // tu mozna przekazac id fabryki
        List<Product> allProducts;
        allProducts = productRepository.findAll();

        model.addAttribute("allProducts", allProducts);

        return "products";
    }
}
