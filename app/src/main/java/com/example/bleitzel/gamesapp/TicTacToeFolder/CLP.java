package com.example.bleitzel.gamesapp.TicTacToeFolder;


import java.util.Scanner;

/**
 * Created by bleitzel on 11/9/2017.
 */

public class CLP extends Player {


    Scanner in;
    private TicTacToeBoard.Board board;
    private Engine engine;

    /**
     * Constructor
     */
    public CLP()
    {
        in = new Scanner(System.in);
    }

    private void printBoard(TicTacToeBoard.Board board, Engine engine)
    {
        //System.out.println("Current Board:");

        // Print Header
        System.out.println("      X  ");
        System.out.println("    0|1|2");

        // Iterate over the rows, y.
        for (int y=0; y<3; y++)
        {
            if (y==1)
            {
                System.out.print("Y");
            }
            else
            {
                System.out.print(" ");
            }
            System.out.print(" "+y);
            // Iterate over the columns, x.
            for (int x=0; x<3; x++)
            {
                int[] pos = {x,y};
                Player curr = board.getPlayerAtPosition(pos);
                System.out.print("|"+engine.getLetterForPlayer(curr));
            }
            System.out.println("");
        }
    }
    @Override
    public void startGame(TicTacToeBoard.Board board, Engine engine)
    {
        //
        printBoard(board, engine);
        //
        System.out.println("Wait until it is your move.");
    }

    @Override
    public void makeMove(TicTacToeBoard.Board board, Engine engine)
    {
        this.board = board;
        this.engine = engine;
        System.out.println();
        System.out.println("=================");
        System.out.println("Make Your Move!");
        System.out.println("You are '"+engine.getLetterForPlayer(this)+"'s.");

        printBoard(board, engine);

        // Prompt user for input
        System.out.print("Enter X (horizontal) position: ");
        int x = in.nextInt();
        System.out.print("Enter Y (vertical) position: ");
        int y = in.nextInt();

        int[] pos = new int[]{x, y};
        boolean validMove = engine.move(this, pos);
        if (validMove)
        {
            System.out.println("Valid move! ["+pos[0]+","+pos[1]+"]");
            System.out.println("Please wait for your next turn.");
        } else
        {
            System.out.println("Invalid move! ["+pos[0]+","+pos[1]+"]");
        }
    }

    @Override
    public void lostGame(TicTacToeBoard.Board board, Engine engine)
    {
        //
        System.out.println("=================");
        System.out.println("You Lost.");
        //System.out.println("Player '"+engine.getLetterForPlayer(this)+"' Lost Game");
        printBoard(board, engine);
    }

    @Override
    public void loseGame(TicTacToeBoard.Board board, Engine engine) {

    }

    @Override
    public void wonGame(TicTacToeBoard.Board board, Engine engine)
    {
        //
        System.out.println("=================");
        System.out.println("You Won!");
        //System.out.println("Player '"+engine.getLetterForPlayer(this)+"' Won Game");
        printBoard(board, engine);
    }

    @Override
    public void draw(TicTacToeBoard.Board board, Engine engine) {

    }

    @Override
    public void drawGame(TicTacToeBoard.Board board, Engine engine)
    {
        //
        System.out.println("=================");
        System.out.println("Game was a Draw.");
        //System.out.println("Player '"+engine.getLetterForPlayer(this)+"' Draw Game");
        printBoard(board, engine);
    }

    @Override
    public void message(String message)
    {
        System.out.println(message);
    }

}