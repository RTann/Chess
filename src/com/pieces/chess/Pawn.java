package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import static com.moves.chess.Moves.*;
import com.types.chess.Type;

public class Pawn extends Piece {

    public Pawn(Type t, Tile ti) {
        super(t, ti);
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
    
    public boolean canPromote() {
        return false;//TODO
    }
    
}
