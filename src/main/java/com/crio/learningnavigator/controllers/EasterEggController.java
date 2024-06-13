package com.crio.learningnavigator.controllers;

import com.crio.learningnavigator.services.NumberFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hidden-feature")
public class EasterEggController {

    @Autowired
    private NumberFactService numberFactService;

    @GetMapping("/{number}")
    public String getNumberFact(@PathVariable int number) {
        return numberFactService.getNumberFact(number);
    }
}
