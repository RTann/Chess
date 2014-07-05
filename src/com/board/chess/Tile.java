package com.board.chess;

import com.types.chess.Type;

/**
 * Each instance represents a tile at a <code>Location</code> on a Chess
 * <code>Board</code>
 */
public class Tile {

    /**
     * This <code>Tile</code>'s <code>Type</code>
     */
    private final Type type;

    /**
     * Instantiates a <code>Tile</code> with a <code>Type</code>
     *
     * @param t <code>Type</code> of this <code>Tile</code>
     */
    public Tile(Type t) {
        type = t;
    }

    /**
     * Returns this <code>Tile</code>'s <code>Type</code>
     *
     * @return The <code>Type</code> of this <code>Tile</code>
     */
    public Type type() {
        return type;
    }

    /**
     * Updates the state of this <code>Tile</code>
     */
    public void update() {
        //TODO
    }

}
