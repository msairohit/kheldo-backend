package com.play.games.kheldo.game.repository;

import com.play.games.kheldo.game.modal.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
