package dev.qvil.leaderboardapi.repository;

import com.sun.tools.javac.util.List;
import dev.qvil.leaderboardapi.model.LeagueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface LeagueRepository extends JpaRepository<LeagueEntity, Long> {
    List<LeagueEntity> findByName(String name);
    LeagueEntity getByCreatedAt(LocalDateTime createdAt);
}
