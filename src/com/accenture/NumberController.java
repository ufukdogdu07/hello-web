package com.accenture;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NumberController {
    @RequestMapping(value = "/number", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("number", "command", new CalcNumber());
    }

    @RequestMapping(value = "/addNumber", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("HelloWeb") CalcNumber calcNumber, ModelMap model) {
        model.addAttribute("number1", calcNumber.getNumber1());
        model.addAttribute("number2", calcNumber.getNumber2());
        int total = calcNumber.getNumber1()+calcNumber.getNumber2();
        model.addAttribute("total", total);
        return "total";
    }
}
