package com.play.games.kheldo.home.helper;

import com.play.games.kheldo.home.response.BaseResponse;
import com.play.games.kheldo.home.response.GameVO;
import org.springframework.stereotype.Component;

import java.util.List;


public class ResponseUtil {

    public static BaseResponse<List<GameVO>> prepareGetAllGamesResponse(String status, String subCode, String message,
                                                                        String error, List<GameVO> games){
        BaseResponse<List<GameVO>> response = new BaseResponse<>();
        response.setStatus(status);
        response.setSubCode(subCode);
        response.setMessage(message);
        response.setError(error);
        response.setResponse(games);
        return response;
    }
}
