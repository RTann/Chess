package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

public class Rook extends Piece {

    public Rook(Type t, Tile ti) {
        super(t, ti);
        moves = new LinkedList<>();
        Moves.east().iterate(e -> moves.append(e));
        Moves.north().iterate(e -> moves.append(e));
        Moves.south().iterate(e -> moves.append(e));
        Moves.west().iterate(e -> moves.append(e));
    }
    
}
