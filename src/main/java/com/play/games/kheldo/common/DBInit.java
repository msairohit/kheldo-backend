package com.play.games.kheldo.common;

import com.play.games.kheldo.game.modal.Game;
import com.play.games.kheldo.game.repository.GameRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.Date;

@Component
@Slf4j
public class DBInit {

    @Autowired
    private GameRepository gameRepository;

    static {
        Date date = new Date();
        game1 = Game
                .builder()
                .name("Game1 name")
                .description("Game1 description")
                .imageId("game1 imageId")
                .createdBy("sai")
                .createdTime(date)
                .noOfPlayers(10)
                .noOfTimesPlayed(2)
                .rating(4.5f)
                .routePath("game1 routePath")
                .updatedBy("sai")
                .updatedTime(date)
                .build();
        game2 = Game
                .builder()
                .name("Game2 name")
                .description("Game2 description")
                .imageId("game2 imageId")
                .createdBy("rohit")
                .createdTime(date)
                .noOfPlayers(5)
                .noOfTimesPlayed(3)
                .rating(3.5f)
                .routePath("game2 routePath")
                .updatedBy("rohit")
                .updatedTime(date)
                .build();
    }

    private static Game game1;
    private static Game game2;

    @PostConstruct
    public void insertTempData() {
        log.debug("Initializing DB.");
        gameRepository.saveAll(Arrays.asList(game1, game2));
    }

    @PreDestroy
    public void destroyTempData() {
        log.debug("Removing temp data.");
        gameRepository.deleteAll(Arrays.asList(game1, game2));
    }
}
