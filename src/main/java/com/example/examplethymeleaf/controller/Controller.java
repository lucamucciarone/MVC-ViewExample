package com.example.examplethymeleaf.controller;

import org.springframework.ui.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    //Model
    @RequestMapping("/messaggioconmodel")
    public String passParametersWithModel(Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("spring", "mvc");
        model.addAttribute("message", "messaggio con Model");
        model.mergeAttributes(map);
        return "response/message";
    }

    //ModelMap
    @RequestMapping("/messaggioconmodelmap")
    public String passParametersWithModelMap(ModelMap map) {
        map.addAttribute("welcomeMessage", "welcome");
        map.addAttribute("message", "messaggio con ModelMap");
        return "response/message";
    }

    //ModelAndView
    @RequestMapping("/messaggioconmodelandview")
    public ModelAndView passParametersWithModelAndView() {
        ModelAndView modelAndView = new ModelAndView("response/message");
        modelAndView.addObject("message", "messaggio con ModelAndView");
        return modelAndView;
    }


}
