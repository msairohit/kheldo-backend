package com.play.games.kheldo.game.services;

import com.play.games.kheldo.common.BaseResponse;
import com.play.games.kheldo.common.QuizStatusEnum;
import com.play.games.kheldo.game.modal.GameStatus;
import com.play.games.kheldo.game.repository.GameStatusRepository;
import com.play.games.kheldo.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GameStatusService {

    @Autowired
    GameStatusRepository gameStatusRepository;


    public BaseResponse<GameStatus> saveInitialGameStatus(GameStatus gameStatus) {
        GameStatus saved = gameStatusRepository.save(gameStatus);
        return ResponseUtil.prepareGetAllGamesResponse("success", "200", "Game status saved successfully", null, saved);
    }

    public BaseResponse<GameStatus> updateQuizStatus(String roomId, String quizStatus) {
        //TODO: Need to add custom exceptions.
        try {
            GameStatus byRoomId;
            byRoomId = gameStatusRepository.findByRoomId(roomId).orElseThrow(() -> new Exception("Room not found: " + roomId));
            if (QuizStatusEnum.contains(quizStatus)) {
                byRoomId.setQuizStatus(quizStatus);
                GameStatus save = gameStatusRepository.save(byRoomId);
                return ResponseUtil.prepareGetAllGamesResponse("success", "200", "quiz status saved successfully", null, save);
            } else {
                throw new Exception("Invalid quizStatus passed: " + quizStatus);
            }
        } catch (Exception e) {
            return ResponseUtil.prepareGetAllGamesResponse("failed", "500", "failed to save quiz status", e.getMessage(), null);
        }
    }

    public BaseResponse<GameStatus> updateQuizStatusAndStartTime(String roomId, String quizStatus, Date startTime) {
        //TODO: Need to add custom exceptions.
        try {
            GameStatus byRoomId;
            byRoomId = gameStatusRepository.findByRoomId(roomId).orElseThrow(() -> new Exception("Room not found: " + roomId));
            if (QuizStatusEnum.contains(quizStatus)) {
                byRoomId.setQuizStatus(quizStatus);
                byRoomId.setStartTime(startTime);
                GameStatus save = gameStatusRepository.save(byRoomId);
                return ResponseUtil.prepareGetAllGamesResponse("success", "200", "quiz status saved successfully", null, save);
            } else {
                throw new Exception("Invalid quizStatus passed: " + quizStatus);
            }
        } catch (Exception e) {
            return ResponseUtil.prepareGetAllGamesResponse("failed", "500", "failed to save quiz status", e.getMessage(), null);
        }
    }

    public BaseResponse<GameStatus> updateQuizStatusAndEndTimeAndMaxScore(String roomId, String quizStatus, Date endTime, String maxScore) {
        //TODO: Need to add custom exceptions.
        try {
            GameStatus byRoomId;
            byRoomId = gameStatusRepository.findByRoomId(roomId).orElseThrow(() -> new Exception("Room not found: " + roomId));
            if (QuizStatusEnum.contains(quizStatus)) {
                byRoomId.setQuizStatus(quizStatus);
                byRoomId.setEndTime(endTime);
                byRoomId.setMaxScore(maxScore);
                GameStatus save = gameStatusRepository.save(byRoomId);
                return ResponseUtil.prepareGetAllGamesResponse("success", "200", "QuizStatusAndEndTimeAndMaxScore updated successfully.", null, save);
            } else {
                throw new Exception("Invalid quizStatus passed: " + quizStatus);
            }
        } catch (Exception e) {
            return ResponseUtil.prepareGetAllGamesResponse("failed", "500", "failed to save QuizStatusAndEndTimeAndMaxScore", e.getMessage(), null);
        }
    }
}
