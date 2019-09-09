package dev.qvil.leaderboardapi.service;

import dev.qvil.leaderboardapi.model.LeagueEntity;
import dev.qvil.leaderboardapi.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    @Autowired
    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public List<LeagueEntity> findAll() {
        return leagueRepository.findAll();
    }
}
