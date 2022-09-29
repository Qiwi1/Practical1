package com.example.Practical1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "Главная страница");
        return "Home";
    }

    @GetMapping("/calc")
    public String Calc(Model model) {
        model.addAttribute("title", 167);
        return "Home";
    }

    @PostMapping("/res")
    public String PostResult(
            @RequestParam(
                    value = "variable",
                    required = false,
                    defaultValue = "1") int a,
            @RequestParam(
                    value = "variable2",
                    required = false,
                    defaultValue = "2") int b,
            @RequestParam(
                    value = "Do",
                    required = false,
                    defaultValue = "+") String WhatDo,
            Model model) {
        int c = 0;
        if (WhatDo.equals("+"))
            c = a + b;
        else if (WhatDo.equals("-"))
            c = a - b;
        else if (WhatDo.equals("*"))
            c = a * b;
        else if (WhatDo.equals("/"))
            c = a / b;
        model.addAttribute("answear", c);
        return "Resultat";
    }

    @GetMapping("/getres")
    public String GetResult(
            @RequestParam(
                    value = "getvariable",
                    required = false,
                    defaultValue = "1") int a,
            @RequestParam(
                    value = "getvariable2",
                    required = false,
                    defaultValue = "2") int b,
            @RequestParam(
                    value = "getDo",
                    required = false,
                    defaultValue = "+") String WhatDo,
            Model model) {
        int c = 0;
        if (WhatDo.equals("+"))
            c = a + b;
        else if (WhatDo.equals("-"))
            c = a - b;
        else if (WhatDo.equals("*"))
            c = a * b;
        else if (WhatDo.equals("/"))
            c = a / b;
        model.addAttribute("answear", c);
        return "Resultat";
    }
}
