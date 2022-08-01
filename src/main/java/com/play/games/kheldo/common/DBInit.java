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
                .name("Master Quiz")
                .description("A perfect place show up your knowledge and quickness")
                .imageId("1001.jpg")
                .createdBy("sai")
                .createdTime(date)
                .noOfPlayers(20)
                .noOfTimesPlayed(48)
                .rating(4.5f)
                .routePath("quiz")
                .updatedBy("sai")
                .updatedTime(date)
                .build();
        game2 = Game
                .builder()
                .name("Monopoly")
                .description("Bring your master mind here to grab all market, Will you beat the market")
                .imageId("1002.jpg")
                .createdBy("rohit")
                .createdTime(date)
                .noOfPlayers(5)
                .noOfTimesPlayed(30)
                .rating(3.5f)
                .routePath("monopoly")
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
