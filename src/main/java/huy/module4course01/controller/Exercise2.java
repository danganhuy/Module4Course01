package huy.module4course01.controller;

import huy.module4course01.model.Customer;
import huy.module4course01.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Exercise2 {
    private static CustomerService customerService = new CustomerService();

    @GetMapping("/customers1")
    public String showList(HttpServletRequest request) {
        List<Customer> customers = customerService.getCustomers();
        request.setAttribute("value", 1);
        request.setAttribute("customers", customers);
        return "exercise2/list";
    }

    @GetMapping("/customers2")
    public String showList(Model model) {
        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("value", 2);
        model.addAttribute("customers", customers);
        return "exercise2/list";
    }

    @GetMapping("/customers3")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("exercise2/list");
        List<Customer> customers = customerService.getCustomers();
        modelAndView.addObject("value", 3);
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
