package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import static com.moves.chess.Moves.*;
import com.types.chess.Type;

/**
 * Each instance represents a pawn
 */
public class Pawn extends Piece {

    /**
     * Instantiates a <code>Pawn</code> with a <code>Type</code>
     *
     * @param t <code>Type</code> of <code>Piece</code>
     */
    public Pawn(Type t) {
        type = t;
        moves = new LinkedList<>();
        moves.append(N1);
        moves.append(N2);
        moves.append(NE1);
        moves.append(NW1);
        moves.append(S1);
        moves.append(S2);
        moves.append(SE1);
        moves.append(SW1);
    }

}
