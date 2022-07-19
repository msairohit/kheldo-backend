package com.play.games.kheldo.game.controller;

import com.play.games.kheldo.common.BaseResponse;
import com.play.games.kheldo.game.response.GameVO;
import com.play.games.kheldo.game.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Games")
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping
    public String testMethod() {
        return "{  \"response\" : \"Backend app is working fine for now!!\" }";
    }

    @GetMapping("/getAllGames")
    public BaseResponse<List<GameVO>> getGames() {
        BaseResponse<List<GameVO>> response = gameService.getAllGames();
        return response;
    }

    @GetMapping("/update-times-played/{gameId}")
    public boolean updateNoOfTimesGamePlayed(@PathVariable("gameId") String gameId) {
        return gameService.updateNoOfTimesGamePlayed(gameId);
    }
}
