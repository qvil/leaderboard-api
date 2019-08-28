package dev.qvil.leaderboardapi.repository;

import dev.qvil.leaderboardapi.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
    List<PlayerEntity> findByName(String name);
}
