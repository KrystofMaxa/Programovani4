package com.example.kocickyApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AhojController {



    @GetMapping("/ahoj")
    public String ahoj(@RequestParam(defaultValue="Pepa")String name, Model model) {
        model.addAttribute("name", name);
        return "ahoj";
    }


}