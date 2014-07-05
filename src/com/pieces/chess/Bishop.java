package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

/**
 * Each instance represents a bishop
 */
public class Bishop extends Piece {

    /**
     * Instantiates a <code>Bishop</code> with a <code>Type</code> and initial
     * <code>Tile</code>
     *
     * @param t <code>Type</code> of <code>Piece</code>
     * @param ti Initial <code>Tile</code>
     */
    public Bishop(Type t, Tile ti) {
        super(t, ti);
        moves = new LinkedList<>();
        Moves.northEast().iterate(e -> moves.append(e));
        Moves.northWest().iterate(e -> moves.append(e));
        Moves.southEast().iterate(e -> moves.append(e));
        Moves.southWest().iterate(e -> moves.append(e));
    }

}
