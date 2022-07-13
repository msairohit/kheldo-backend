package com.play.games.kheldo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping
    public String testMethod() {
        return "{  \"response\" : \"Backend app is working fine for now!!\" }";
    }
}
