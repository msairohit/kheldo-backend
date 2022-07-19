package com.play.games.kheldo.common;

import java.util.stream.Stream;

public enum QuizStatusEnum {
    OPEN, STARTED, CLOSED;

    public static boolean contains(String quizStatus) {
        return Stream.of(QuizStatusEnum.values()).anyMatch(v -> v.name().equals(quizStatus));
    }
}
