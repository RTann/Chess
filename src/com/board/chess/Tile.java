package com.board.chess;

import com.pieces.chess.Piece;
import com.types.chess.Type;

/**
 * Each instance represents a tile at a <code>Location</code> on a Chess
 * <code>Board</code>
 */
public class Tile {

    /**
     * The <code>Piece</code> that is on this <code>Tile</code>
     */
    private Piece piece;

    /**
     * This <code>Tile</code>'s <code>Type</code>
     */
    private final Type type;

    /**
     * Instantiates a <code>Tile</code> with a <code>Type</code>
     *
     * @param t <code>Type</code> of this <code>Tile</code>
     * @param p Initial <code>Piece</code> on this <code>Tile</code>
     */
    public Tile(Type t, Piece p) {
        type = t;
        piece = p;
    }

    /**
     * Returns the <code>Piece</code> on this <code>Tile</code>
     *
     * @return The <code>Piece</code> on this <code>Tile</code>
     */
    public Piece piece() {
        return piece;
    }

    /**
     * Sets a <code>Piece</code> on this <code>Tile</code>
     *
     * @param p <code>Piece</code> to place on this <code>Tile</code>
     *
     * public void setPiece(Piece p) { piece = p; }
     */
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
