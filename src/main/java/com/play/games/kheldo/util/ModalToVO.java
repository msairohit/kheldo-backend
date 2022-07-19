package com.play.games.kheldo.util;

import com.play.games.kheldo.game.modal.Game;
import com.play.games.kheldo.game.response.GameVO;

import java.util.ArrayList;
import java.util.List;

public class ModalToVO {

    public static List<GameVO> setGamesModalToVO(List<Game> gameList){
        List<GameVO> gameVOList = new ArrayList<>();
        gameList.forEach(game -> {
            GameVO gameVO = new GameVO();
            gameVO.setGameId(game.getId());
            gameVO.setGameName(game.getName());
            gameVO.setGameDescription(game.getDescription());
            gameVO.setImageId(game.getImageId());
            gameVO.setNoOfPlayers(game.getNoOfPlayers());
            gameVO.setNoOfTimesPlayed(game.getNoOfTimesPlayed());
            gameVO.setRating(game.getRating());
            gameVO.setRoutePath(game.getRoutePath());
            gameVOList.add(gameVO);
        });
        return gameVOList;
    }
}
