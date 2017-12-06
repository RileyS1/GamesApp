package com.example.bleitzel.gamesapp.TicTacToeFolder;

/**
 * Created by nvoorstad on 12/6/2017.
 */

public class TTTrandom {
    private int randomPositionPart(int min, int max)
    {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    protected int[] randomPosition()
    {
        int[] pos = {
                randomPositionPart(0,2),
                randomPositionPart(0,2)
        };
        return pos;
    }

    protected int[] generateMovePosition(TicTacToeBoard board, Engine engine)
    {
        return randomPosition();
    }

}
