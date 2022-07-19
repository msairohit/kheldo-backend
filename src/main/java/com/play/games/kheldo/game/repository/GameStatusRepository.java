package com.play.games.kheldo.game.repository;

import com.play.games.kheldo.game.modal.GameStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameStatusRepository extends JpaRepository<GameStatus, Long> {

    Optional<GameStatus> findByRoomId(String roomId);
}
