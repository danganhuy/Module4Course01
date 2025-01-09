package huy.module4course01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise1 {
    @RequestMapping("/greeting")
    public String greeting(String name, Model model) {
        model.addAttribute("name", name);
        return "exercise1";
    }
}
