package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import static com.moves.chess.Moves.*;
import com.types.chess.Type;

/**
 * Each instance represents a king
 */
public class King extends Piece {

    /**
     * Instantiates a <code>King</code> with a <code>Type</code>
     *
     * @param t <code>Type</code> of <code>Piece</code>
     */
    public King(Type t) {
        type = t;
        moves = new LinkedList<>();
        moves.append(E1);
        moves.append(E2);
        moves.append(N1);
        moves.append(NE1);
        moves.append(NW1);
        moves.append(S1);
        moves.append(SE1);
        moves.append(SW1);
        moves.append(W1);
        moves.append(W2);
    }

}
