package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

/**
 * Each instance represents a knight
 */
public class Knight extends Piece {

    /**
     * Instantiates a <code>Knight</code> with a <code>Type</code> and initial
     * <code>Tile</code>
     *
     * @param t <code>Type</code> of <code>Piece</code>
     * @param ti Initial <code>Tile</code>
     */
    public Knight(Type t, Tile ti) {
        super(t, ti);
        moves = new LinkedList<>();
        Moves.knight().iterate(e -> moves.append(e));
    }

}
