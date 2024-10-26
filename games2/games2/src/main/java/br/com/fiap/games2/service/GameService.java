package br.com.fiap.games2.service;

import br.com.fiap.games2.model.Game2;
import br.com.fiap.games2.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Game2 insertGame(Game2 game2) {
        return gameRepository.save(game2);
    }

    public List<Game2> getAllGames(){
        return gameRepository.findAll();
    }
}
