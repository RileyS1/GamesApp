package com.example.bleitzel.gamesapp.TicTacToeFolder;

/**
 * Created by nvoorstad on 12/6/2017.
 */

public abstract class Player implements EngineObserver{

    @Override
    public void makeMove(TicTacToeBoard.Board board, Engine engine) {

    }

    public abstract void lostGame(TicTacToeBoard.Board board, Engine engine);

    public abstract void drawGame(TicTacToeBoard.Board board, Engine engine);
}
