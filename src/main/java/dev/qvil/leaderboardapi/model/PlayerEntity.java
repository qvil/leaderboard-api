package dev.qvil.leaderboardapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "players")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String name;
}
