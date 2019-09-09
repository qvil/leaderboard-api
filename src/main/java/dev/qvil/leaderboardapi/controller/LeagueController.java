package dev.qvil.leaderboardapi.controller;

import dev.qvil.leaderboardapi.model.LeagueEntity;
import dev.qvil.leaderboardapi.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leagues")
public class LeagueController {

    private final LeagueService leagueService;

    @Autowired
    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping({"", "/"})
    public List<LeagueEntity> findAll() {
        return leagueService.findAll();
    }


}
