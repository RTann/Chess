package com.pieces.chess;

import com.amf.structures.list.List;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

public abstract class Piece {
    
    protected Tile tile;
    
    protected Type type;

    public Piece(Type t) {
        type = t;
    }

    public abstract List<Moves> moves();
    
    public Tile tile() {
        return tile;
    }
    
    public Type type() {
        return type;
    }

}
