package com.pieces.chess;

import com.amf.structures.list.List;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

/**
 * Each instance represents a chess piece
 */
public class Piece {

    /**
     * Is true if and only if this statement is true: "This piece has moved
     * before"
     */
    protected boolean hasMoved;

    /**
     * A <code>List</code> of all possible moves for <code>this</code>
     */
    protected List<Moves> moves;

    /**
     * The <code>Tile</code> on which this piece is located
     */
    protected Tile tile;

    /**
     * The <code>Type</code> of <code>this</code>
     */
    protected final Type type;

    /**
     * Instantiates a Chess <code>Piece</code>
     *
     * @param t The <code>Type</code> for this <code>Piece</code>
     * @param ti The <code>Tile</code> on which this <code>Piece</code> is
     * initially located
     */
    public Piece(Type t, Tile ti) {
        type = t;
        tile = ti;
    }

    /**
     * Returns "This piece has moved at least once in this game"
     *
     * @return  <code>true</code> or <code>false</code> depending on the validity
     * of the above statement
     */
    public boolean hasMoved() {
        return hasMoved;
    }

    /**
     * Returns a <code>List</code> of all possible moves for <code>this</code>
     *
     * @return All possible moves for this <code>Piece</code>
     */
    public List<Moves> moves() {
        return moves;
    }

    /**
     * Returns the <code>Tile</code> on which this <code>Piece</code> is located
     *
     * @return <code>Tile</code> on which this piece is located
     */
    public Tile tile() {
        return tile;
    }

    /**
     * Returns this Piece's <code>Type</code>
     *
     * @return <code>Type</code> of <code>Piece</code>
     */
    public Type type() {
        return type;
    }

}
