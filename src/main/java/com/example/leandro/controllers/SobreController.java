package com.example.leandro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/Sobre")
public class SobreController {
    @GetMapping
    public String index(){
        return "sobre/Sobre";
    }


}