package com.example.bleitzel.gamesapp.TicTacToeFolder;

/**
 * Created by nvoorstad on 12/6/2017.
 */

public class TTTrandom extends Player {

    private int randomPositionPart(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    protected int[] randomPosition() {
        int[] pos = {
                randomPositionPart(0, 2),
                randomPositionPart(0, 2)
        };
        return pos;
    }

    protected int[] generateMovePosition(TicTacToeBoard.Board board, Engine engine) {
        return randomPosition();
    }

    protected void printBoard(TicTacToeBoard.Board board, Engine engine) {
        //System.out.println("Current Board:");
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                int[] pos = {x, y};
                Player curr = board.getPlayerAtPosition(pos);
                System.out.print(engine.getLetterForPlayer(curr));
            }
            System.out.println("");
        }
    }

    public void startGame(TicTacToeBoard.Board board, Engine engine) {
        printBoard(board, engine);
    }

    @Override
    public void makeMove(TicTacToeBoard.Board board, Engine engine) {
        System.out.println("=================");
        System.out.println("Player '" + engine.getLetterForPlayer(this) + "' Make Move:");
    //tells player to make a move
        printBoard(board, engine);


        int[] pos = generateMovePosition(board, engine);
        boolean validMove = engine.move(this, pos);
        if (validMove) {
            System.out.println("Valid move! [" + pos[0] + "," + pos[1] + "]");
        } else {
            System.out.println("Invalid move! [" + pos[0] + "," + pos[1] + "]");
        }//tels weather move is valid or invalid
    }

    @Override
    public void lostGame(TicTacToeBoard.Board board, Engine engine) {
        //
        System.out.println("=================");
        System.out.println("Player '" + engine.getLetterForPlayer(this) + "' Lost Game");
        printBoard(board, engine);//tells player when they have lost the game
    }

    @Override
    public void wonGame(TicTacToeBoard.Board board, Engine engine) {
        //
        System.out.println("=================");
        System.out.println("Player '" + engine.getLetterForPlayer(this) + "' Won Game");
        printBoard(board, engine);//tells player when they have lost the game
    }

    @Override
    public void drawGame(TicTacToeBoard.Board board, Engine engine) {
        //
        System.out.println("=================");
        System.out.println("Player '" + engine.getLetterForPlayer(this) + "' Draw Game");
        printBoard(board, engine);//telss player when there is a draw
    }



    @Override
    public void loseGame(TicTacToeBoard.Board board, Engine engine) {

    }

    @Override
    public void draw(TicTacToeBoard.Board board, Engine engine) {

    }

    @Override
    public void message(String message) {
        System.out.println(message);
    }

}

