package com.game.chess;

import com.types.chess.Type;

/**
 * Each instance represents a player of Chess
 */
public class Player {

    /**
     * The <code>Player</code>'s name represented a a <code>String</code>
     */
    private final String name;

    /**
     * Represents the <code>Player</code>'s type (White or Black)
     */
    private final Type type;

    /**
     * Instantiates a <code>Player</code> with a <code>Type</code> of piece t
     *
     * @param n The <code>Player</code>'s name
     * @param t The <code>Player</code>'s type of piece
     */
    public Player(String n, Type t) {
        name = n;
        type = t;
    }

}
