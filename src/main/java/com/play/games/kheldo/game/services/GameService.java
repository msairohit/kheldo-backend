package com.play.games.kheldo.game.services;

import com.play.games.kheldo.common.BaseResponse;
import com.play.games.kheldo.util.ModalToVO;
import com.play.games.kheldo.game.modal.Game;
import com.play.games.kheldo.game.repository.GameRepository;
import com.play.games.kheldo.game.response.GameVO;
import com.play.games.kheldo.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public BaseResponse<List<GameVO>> getAllGames() {

        List<Game> games = gameRepository.findAll();
        List<GameVO> gameVOList = ModalToVO.setGamesModalToVO(games);
        /*To Do
         yet to constants file
         Exception handling. send proper error code and error message for empty games list
         save and log request and response
        */
        return ResponseUtil.prepareGetAllGamesResponse("success", "200", "games list retrieved successfully", null, gameVOList);
    }

    public boolean updateNoOfTimesGamePlayed(String gameId) {
        Optional<Game> gameById = gameRepository.findById(Long.valueOf(gameId));
        if (gameById.isPresent()) {
            Game game = gameById.get();
            game.setNoOfTimesPlayed(game.getNoOfTimesPlayed() + 1);
            gameRepository.save(game);
            return true;
        } else {
            return false;
        }
    }
}
