package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

public class Knight extends Piece {

    public Knight(Type t, Tile ti) {
        super(t, ti);
        moves = new LinkedList<>();
        Moves.knight().iterate(e -> moves.append(e));
    }
    
}
