package dev.qvil.leaderboardapi.controller;

import dev.qvil.leaderboardapi.model.PlayerEntity;
import dev.qvil.leaderboardapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void post(@RequestBody PlayerEntity playerEntity) {
        System.out.println(playerEntity);

        playerService.create(playerEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void put(@RequestBody PlayerEntity playerEntity, @PathVariable Long id) {
        playerService.update(id, playerEntity);
    }

//    보통 isDeleted flag를 true/false로 넣고 사용함.
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        playerService.delete(id);
    }
}
