package com.example.bleitzel.gamesapp.TicTacToeFolder;

/**
 * Created by nvoorstad on 12/5/2017.
 */

public interface MoveObserver {
    //determines which player makes a move and which position the player moves to
    boolean move(Player player, int[] position);
}
