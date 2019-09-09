package dev.qvil.leaderboardapi.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "matches")
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private LocalDateTime createdAt;

    @Basic
    private LocalDateTime modifiedAt;

    @Basic
    private Integer leagueId;
    @Basic
    private Integer winnerId;
    @Basic
    private Integer loserId;
    @Basic
    private Integer winnerScore;
    @Basic
    private Integer loserScore;
}
