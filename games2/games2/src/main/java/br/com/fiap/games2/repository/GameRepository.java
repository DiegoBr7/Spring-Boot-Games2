package br.com.fiap.games2.repository;

import br.com.fiap.games2.model.Game2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository <Game2 , Long> {
}
