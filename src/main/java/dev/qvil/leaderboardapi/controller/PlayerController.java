package dev.qvil.leaderboardapi.controller;

import dev.qvil.leaderboardapi.model.PlayerEntity;
import dev.qvil.leaderboardapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<PlayerEntity> findByName(@PathVariable String name) {
        List<PlayerEntity> byName = playerService.findByName(name);
        return byName;
    }
}
