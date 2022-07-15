package com.play.games.kheldo.home.helper;

import com.play.games.kheldo.game.dao.modal.Game;
import com.play.games.kheldo.home.response.GameVO;

import java.util.ArrayList;
import java.util.List;

public class ModalToVO {

    public static List<GameVO> setGamesModalToVO(List<Game> gameList){
        List<GameVO> gameVOList = new ArrayList<>();
        for(int i=0;i<gameList.size();i++){
            GameVO gameVO = new GameVO();
            gameVO.setGameId(gameList.get(i).getId());
            gameVO.setGameName(gameList.get(i).getName());
            gameVO.setGameDescription(gameList.get(i).getDescription());
            gameVOList.add(gameVO);
        }
        return gameVOList;
    }
}
