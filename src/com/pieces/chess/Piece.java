package com.pieces.chess;

import com.amf.structures.list.List;
import com.board.chess.Tile;
import com.moves.chess.Moves;
import com.types.chess.Type;

public class Piece {
    
    protected boolean hasMoved;
    
    protected List<Moves> moves;
    
    protected Tile tile;
    
    protected Type type;

    public Piece(Type t, Tile ti) {
        type = t;
        tile = ti;
    }
    
    public boolean hasMoved() {
        return hasMoved;
    }

    public List<Moves> moves() {
        return moves;
    }
    
    public Tile tile() {
        return tile;
    }
    
    public Type type() {
        return type;
    }

}
