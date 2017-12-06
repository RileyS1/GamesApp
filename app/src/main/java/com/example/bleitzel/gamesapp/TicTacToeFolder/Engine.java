package com.example.bleitzel.gamesapp.TicTacToeFolder;

import java.util.ArrayList;

/**
 * Created by nvoorstad on 12/5/2017.
 */
//engine for tic tac toe, makes game possible to run and needed to work correctly
public class Engine implements MoveObserver {
    //variables for board and player, X O

    final private char X = 'X';
    final private char O = 'O';
    private ArrayList<Player> players;
    private TicTacToeBoard.Board board;
    private Player currentPlayer;

    public Engine() {
        players = new ArrayList<Player>(players);//this initializes the players array list
    }

    public void startGame() throws Exception {
        //starts new game and gets a new board
        TicTacToeBoard.Board gameBoard = new TicTacToeBoard.Board();
        startGame(gameBoard);
    }


    @Override
    public boolean move(Player player, int[] position) {

        return false;
    }

    public boolean addPlayer(Player newPlayer) {
        if (!players.contains(newPlayer)) {
            players.add(newPlayer);
            return true;
        } else {
            return false;
        }
    }

    public void startGame(TicTacToeBoard.Board gameBoard) throws Exception {
        //Use gameBoard
        board = gameBoard;

        // Verifies that we have 2 players.
        if (players.size() == 2) {
            //Exactly 2 players.
            System.out.println("Starting Game!");
        } else {
            // does not start game, less or more than 2 players
            throw new Exception("Invalid number of players. Not enough or too many players. There are currently " + players.size() + " players.");
        }

    }
}

