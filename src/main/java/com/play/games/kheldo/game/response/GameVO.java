package com.play.games.kheldo.game.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.play.games.kheldo.common.BaseResponse;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameVO extends BaseResponse<String> {

    private Long gameId;

    private String gameName;

    private String gameDescription;

    private String routePath;

    private int noOfPlayers;

    private String imageId;

    private int noOfTimesPlayed;

    private float rating;


    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getRoutePath() {
        return routePath;
    }

    public void setRoutePath(String routePath) {
        this.routePath = routePath;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public int getNoOfTimesPlayed() {
        return noOfTimesPlayed;
    }

    public void setNoOfTimesPlayed(int noOfTimesPlayed) {
        this.noOfTimesPlayed = noOfTimesPlayed;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "GameVO{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameDescription='" + gameDescription + '\'' +
                '}';
    }
}
