package huy.module4course01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Exercise3 {
    @RequestMapping("/currency_exchange")
    public ModelAndView currencyExchange(String usd) {
        double vnd;
        try {
            vnd = Float.parseFloat(usd) * 23000;
        } catch (Exception e) {
            usd = "0";
            vnd = 0;
        }
        ModelAndView modelAndView = new ModelAndView("exercise3");
        modelAndView.addObject("vnd", vnd);
        modelAndView.addObject("usd", usd);
        return modelAndView;
    }
}
