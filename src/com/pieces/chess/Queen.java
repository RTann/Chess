package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.moves.chess.Moves;
import com.types.chess.Type;

/**
 * Each instance represents a queen
 */
public class Queen extends Piece {

    /**
     * Instantiates a <code>Queen</code> with a <code>Type</code>
     *
     * @param t <code>Type</code> of <code>Piece</code>
     */
    public Queen(Type t) {
        type = t;
        moves = new LinkedList<>();
        Moves.east().iterate(e -> moves.append(e));
        Moves.north().iterate(e -> moves.append(e));
        Moves.northEast().iterate(e -> moves.append(e));
        Moves.northWest().iterate(e -> moves.append(e));
        Moves.south().iterate(e -> moves.append(e));
        Moves.southEast().iterate(e -> moves.append(e));
        Moves.southWest().iterate(e -> moves.append(e));
        Moves.west().iterate(e -> moves.append(e));
    }

}
