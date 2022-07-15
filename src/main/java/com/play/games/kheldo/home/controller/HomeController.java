package com.play.games.kheldo.home.controller;

import com.play.games.kheldo.home.response.BaseResponse;
import com.play.games.kheldo.home.response.GameVO;
import com.play.games.kheldo.home.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HomeService homeService;
    @GetMapping
    public String testMethod() {
        return "{  \"response\" : \"Backend app is working fine for now!!\" }";
    }

    @GetMapping("/getAllGames")
    public BaseResponse<List<GameVO>> getGames(){
        BaseResponse<List<GameVO>> response = homeService.getAllGames();
        return response;
    }
}
