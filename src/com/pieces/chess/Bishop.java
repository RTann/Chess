package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

public class Bishop extends Piece {

    public Bishop(Type t, Tile ti) {
        super(t, ti);
        moves = new LinkedList<>();
        Moves.northEast().iterate(e -> moves.append(e));
        Moves.northWest().iterate(e -> moves.append(e));
        Moves.southEast().iterate(e -> moves.append(e));
        Moves.southWest().iterate(e -> moves.append(e));
    }
    
}
