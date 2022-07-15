package com.play.games.kheldo.home.service;

import com.play.games.kheldo.game.dao.modal.Game;
import com.play.games.kheldo.game.dao.repository.GameRepository;
import com.play.games.kheldo.home.helper.ModalToVO;
import com.play.games.kheldo.home.helper.ResponseUtil;
import com.play.games.kheldo.home.response.BaseResponse;
import com.play.games.kheldo.home.response.GameVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    GameRepository gameRepository;
    public BaseResponse<List<GameVO>> getAllGames(){

        List<Game> games = gameRepository.findAll();
        List<GameVO> gameVOList= ModalToVO.setGamesModalToVO(games);
        /*To Do
         yet to constants file
         Exception handling. send proper error code and error message for empty games list
         save and log request and response
        */
        return ResponseUtil.prepareGetAllGamesResponse("success", "200", "games list retrieved successfully",null,gameVOList);
    }
}
