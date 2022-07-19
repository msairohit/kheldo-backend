package com.play.games.kheldo.util;

import com.play.games.kheldo.common.BaseResponse;


public class ResponseUtil {

    public static <T> BaseResponse<T> prepareGetAllGamesResponse(String status, String subCode, String message,
                                                                        String error, T data){
        BaseResponse<T> response = new BaseResponse<>();
        response.setStatus(status);
        response.setSubCode(subCode);
        response.setMessage(message);
        response.setError(error);
        response.setResponse(data);
        return response;
    }
}
