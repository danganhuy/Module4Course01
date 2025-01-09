package huy.module4course01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Exercise1 {
    @GetMapping("/greeting")
    public String greeting(String name, Model model) {
        model.addAttribute("name", name);
        return "exercise1";
    }
}
