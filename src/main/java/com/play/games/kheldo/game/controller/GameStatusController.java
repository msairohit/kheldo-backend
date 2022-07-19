package com.play.games.kheldo.game.controller;

import com.play.games.kheldo.common.BaseResponse;
import com.play.games.kheldo.game.modal.GameStatus;
import com.play.games.kheldo.game.services.GameStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/game-status")
public class GameStatusController {
    @Autowired
    GameStatusService gameStatusService;


    @PostMapping("/save-initial-game-status")
    public BaseResponse<GameStatus> saveInitialGameStatus(GameStatus gameStatus) {
        return gameStatusService.saveInitialGameStatus(gameStatus);
    }

    @PatchMapping("/update-game-status/{roomId}/{quizStatus}")
    public BaseResponse<GameStatus> updateQuizStatus(@PathVariable String roomId, @PathVariable String quizStatus) {
        return gameStatusService.updateQuizStatus(roomId, quizStatus);
    }

    @PatchMapping("/update-game-status/{roomId}/{quizStatus}/{startTime}")
    public BaseResponse<GameStatus> updateQuizStatusAndStartTime(@PathVariable String roomId, @PathVariable String quizStatus, @PathVariable Date startTime) {
        return gameStatusService.updateQuizStatusAndStartTime(roomId, quizStatus, startTime);
    }

    @PatchMapping("/update-game-status/{roomId}/{quizStatus}/{endTime}/{maxScore}")
    public BaseResponse<GameStatus> updateQuizStatusAndEndTimeAndMaxScore(@PathVariable String roomId, @PathVariable String quizStatus, @PathVariable Date endTime, @PathVariable String maxScore) {
        return gameStatusService.updateQuizStatusAndEndTimeAndMaxScore(roomId, quizStatus, endTime, maxScore);
    }
}
