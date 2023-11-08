package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    @ResponseBody
    public String index() {
        return "<html><body><h1>I'm Index</h1></body></html>";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Antonio");
        return "home-page";
    }
}

