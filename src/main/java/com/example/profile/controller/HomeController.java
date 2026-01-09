package com.example.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.profile.service.BasicInfoService;

@Controller
public class HomeController {

    private final BasicInfoService basicInfoService;

    // Spring will automatically inject the BasicInfoService bean
    public HomeController(BasicInfoService basicInfoService) {
        this.basicInfoService = basicInfoService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("info", basicInfoService.getInfo());
        return "index";
    }

    @GetMapping("/software")
    public String software() {
        return "software";
    }
    @GetMapping("/game")
    public String game(){
        return "/game";
    }
}
