package com.example.leandro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/ps5")
public class ps5Controller {
    @GetMapping
    public String index(){
        return "ps5/PS5";
    }


}