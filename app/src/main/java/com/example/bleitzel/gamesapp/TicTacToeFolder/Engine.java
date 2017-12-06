package com.example.bleitzel.gamesapp.TicTacToeFolder;

import java.util.ArrayList;

/**
 * Created by nvoorstad on 12/5/2017.
 */
//engine for tic tac toe, makes game possible to run and needed to work correctly
public class Engine implements MoveObserver{
    //variables for board and player, X O

    final private char X = 'X';
    final private char O = 'O';
    private ArrayList players;
    private TicTacToeBoard.Board board;
    private Player currentPlayer;

    public Engine(){
        players = new ArrayList(players);//this initializes the players array list
    }

    public void startGame(TicTacToeBoard.Board gameBoard) throws Exception {
        //starts new game and gets a new board
        gameBoard = new TicTacToeBoard.Board();
        startGame(gameBoard);
    }


    @Override
    public boolean move(Player player, int[] position) {

        return false;
    }

}

