package com.game.chess;

import com.board.chess.Board;

public class Game {
    
    private Board board = new Board();
    
    private final Player player1, player2;
    
    public Game(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }
    
    public void update() {
    }
    
}
