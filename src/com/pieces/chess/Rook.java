package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

/**
 * Each instance represents a rook
 */
public class Rook extends Piece {

    /**
     * Instantiates a <code>Rook</code> with a <code>Type</code> and initial
     * <code>Tile</code>
     *
     * @param t <code>Type</code> of <code>Piece</code>
     * @param ti Initial <code>Tile</code>
     */
    public Rook(Type t, Tile ti) {
        super(t, ti);
        moves = new LinkedList<>();
        Moves.east().iterate(e -> moves.append(e));
        Moves.north().iterate(e -> moves.append(e));
        Moves.south().iterate(e -> moves.append(e));
        Moves.west().iterate(e -> moves.append(e));
    }

}
