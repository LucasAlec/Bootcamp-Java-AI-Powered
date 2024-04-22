package me.dio.controller;

import me.dio.domain.model.Game;
import me.dio.domain.repository.GameRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameRepository repository;

    public GameController(GameRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Game>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Game> create(@RequestBody Game izi) {
        return ResponseEntity.
                status(HttpStatus.CREATED).
                body(repository.save(izi));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Game> update(@PathVariable Long id, @RequestBody Game receivedGame) {
        Optional<Game> optionalGame = repository.findById(id);
        if (optionalGame.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Game game = optionalGame.get();

        game.setName(receivedGame.getName());
        game.setPlatform(receivedGame.getPlatform());
        game.setType(receivedGame.getType());

        return ResponseEntity.ok(repository.save(game));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Game> optionalGame = repository.findById(id);
        if (optionalGame.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        repository.delete(optionalGame.get());

        return ResponseEntity.ok().body(null);
    }
}
