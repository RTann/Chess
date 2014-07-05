package com.game.chess;

import com.board.chess.Board;

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
    public Game(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }

    /**
     * Updates the state of this <code>Game</code>
     */
    public void update() {
    }

}
