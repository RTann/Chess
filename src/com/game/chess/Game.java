package com.game.chess;

import com.board.chess.Board;

public class Game {
    
    private GameState state;
    
    public Game() {
        state = new GameState(new Board());
    }

    public static void main(String[] args) {
        // TODO
    }
    
}
