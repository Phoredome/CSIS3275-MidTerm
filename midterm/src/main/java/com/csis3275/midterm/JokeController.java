package com.csis3275.midterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JokeController {
    @Autowired
    private JokeService js;

    @GetMapping
    public String getJoke() {
        return js.getJoke();
    }

    @GetMapping
    public String myController(@ModelAttribute("joke") Model model) {
        return "index";
    }
}
