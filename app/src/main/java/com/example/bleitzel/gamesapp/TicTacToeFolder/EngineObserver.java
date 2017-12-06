package com.example.bleitzel.gamesapp.TicTacToeFolder;

/**
 * Created by nvoorstad on 12/5/2017.
 */

public interface EngineObserver {

        void makeMove(TicTacToeBoard.Board board, Engine engine);
        //notifies player that it is their turn and they have to make a move

        void loseGame(TicTacToeBoard.Board board, Engine engine);
        //notifies player when they have lost the game

        void wonGame(TicTacToeBoard.Board board, Engine engine);
        //notifies player when they have won the game

        void draw(TicTacToeBoard.Board board, Engine engine);
        //notifies the player when there is a draw

        void startGame(TicTacToeBoard.Board board, Engine engine);

        void message(String message);

    }


