package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import static com.moves.chess.Moves.*;
import com.types.chess.Type;

public class King extends Piece {

    public King(Type t, Tile ti) {
        super(t, ti);
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
