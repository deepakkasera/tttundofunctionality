package com.scaler.tttundosolution.controllers;

import com.scaler.tttundosolution.exceptions.EmptyGamesListException;
import com.scaler.tttundosolution.exceptions.InvalidMoveException;
import com.scaler.tttundosolution.models.Game;
import com.scaler.tttundosolution.models.GameState;
import com.scaler.tttundosolution.models.Player;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameController {
    public Game startGame(int dimension, List<Player> players) throws Exception {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public void displayBoard(Game game) {
        game.displayBoard(game.getBoard());
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) throws EmptyGamesListException {
        game.undo();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }
}
