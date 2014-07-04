package com.game.chess;

import com.types.chess.Type;

/**
 * Each instance represents a player of Chess
 */
public class Player {

    /**
     * Represents the Player's type (White or Black)
     */
    private final Type type;

    /**
     * Instantiates a <code>Player</code> with a <code>Type</code> of piece t
     *
     * @param t The Player's type of piece
     */
    public Player(Type t) {
        type = t;
    }

}
