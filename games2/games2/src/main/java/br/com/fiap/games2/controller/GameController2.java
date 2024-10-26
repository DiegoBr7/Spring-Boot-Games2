package br.com.fiap.games2.controller;

import br.com.fiap.games2.model.Game2;
import br.com.fiap.games2.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/games")
public class GameController2 {

    @Autowired
    private GameService gameService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Game2 insertGame(Game2 game2){
        return gameService.insertGame(game2);
    }

    @GetMapping
    public List<Game2> getAllGames() {
        return gameService.getAllGames();
    }

}
