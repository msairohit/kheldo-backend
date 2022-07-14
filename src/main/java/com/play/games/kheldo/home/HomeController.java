package com.play.games.kheldo.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String testMethod() {
        return "{  \"response\" : \"Backend app is working fine for now!!\" }";
    }
}
