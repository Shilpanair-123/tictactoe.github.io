package com.tictactoe.tictacgame;
import java.util.Random;


public class GameEngine {
    private static final random RANDOM = new random();
    private char[] elts;
    private char currentPlayer;
    private boolean ended;

    public GameEngine(){
        elts=new char[9];
        newGame();

    }

    public boolean isEnded() {
        return ended;
    }

    public char play(int x,int y){
        if (!ended && elts[3 * y + x]== '' ){
            elts[3 * y + x] =currentPlayer;
            changePlayer();
        }




}
