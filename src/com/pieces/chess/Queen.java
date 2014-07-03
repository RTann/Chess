package com.pieces.chess;

import com.amf.structures.list.LinkedList;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

public class Queen extends Piece {

    public Queen(Type t, Tile ti) {
        super(t, ti);
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
