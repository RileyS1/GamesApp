package com.example.bleitzel.gamesapp.TicTacToeFolder;

/**
 * Created by nvoorstad on 12/5/2017.
 */

public class TTTapp {
    public static void main(String[] args) throws Exception {

        // Initialize instances and players
        Player firstPlayer = new fPlayer();
        Player secondPlayer = new sPlayer();
        Engine engine = new Engine();

        engine.addPlayer(firstPlayer); // First Player, 'X'
        engine.addPlayer(secondPlayer); // Second Player, 'O'

        // Starts the game
        engine.startGame();

    }

}

