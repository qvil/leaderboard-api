package dev.qvil.leaderboardapi.service;

import dev.qvil.leaderboardapi.model.PlayerEntity;
import dev.qvil.leaderboardapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<PlayerEntity> findByName(String name) {

        return playerRepository.findByName(name);
    }
}
