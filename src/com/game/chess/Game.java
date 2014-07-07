package com.game.chess;

import com.board.chess.Board;
import static com.types.chess.Type.*;

/**
 * Each instance represents a game of Chess
 */
public class Game {

    /**
     * The <code>Board</code> on which this <code>Game</code> is played
     */
    private Board board = new Board();

    /**
     * The two <code>Players</code> of this <code>Game</code>
     */
    private final Player player1, player2;

    /**
     * Instantiates a <code>Game</code> of Chess
     *
     * @param p1 <code>Player</code> one
     * @param p2 <code>Player</code> two
     */
    public Game(String p1, String p2) {
        player1 = new Player(p1, WHITE);
        player2 = new Player(p2, BLACK);
    }
    
    public void play() {
        
    }

    /**
     * Updates the state of this <code>Game</code>
     */
    public void update() {
    }

}
