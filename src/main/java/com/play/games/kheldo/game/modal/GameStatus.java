package com.play.games.kheldo.game.modal;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"game_id", "room_id"}))
public class GameStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long gameId;

    private Long roomId;

    //use QuizStatusEnum Enum
    private String quizStatus;

    private Date startTime;

    private Date endTime;

    private String maxScore;
}
