package dev.qvil.leaderboardapi.service;

import dev.qvil.leaderboardapi.model.PlayerEntity;
import dev.qvil.leaderboardapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerEntity> findByName(String name) {

        return playerRepository.findByName(name);
    }

    public void create(PlayerEntity playerEntity) {
        playerEntity.setId(null);
        playerRepository.save(playerEntity);
    }

    public void update(Long id, PlayerEntity playerEntity) {
        playerEntity.setId((id));
        playerRepository.save(playerEntity);
    }

    public void delete(Long id) {
        playerRepository.deleteById(id);
    }
}
