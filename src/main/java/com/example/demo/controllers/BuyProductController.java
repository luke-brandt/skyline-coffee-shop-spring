package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class BuyProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theId){
        String buyView = "";
        Optional<Product> optional = productRepository.findById(theId);

        if(optional.isPresent()){
            Product tempProduct = optional.get();

            int inventoryAmount = tempProduct.getInv();

            if(inventoryAmount > 0){
                inventoryAmount -= 1;
                tempProduct.setInv(inventoryAmount);
                productRepository.save(tempProduct);
                buyView = "confirmbuyproduct";
            }
            else{
                buyView = "errorbuyproduct";
            }
        }

        return buyView;
    }


}
