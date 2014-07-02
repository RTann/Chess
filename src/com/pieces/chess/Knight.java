package com.pieces.chess;

import com.amf.structures.list.List;
import com.game.chess.State;
import com.moves.chess.Moves;
import com.types.chess.Type;

public class Knight extends Piece {
    
    public Knight(Type t) {
        super(t);
        tile = null;
    }
    
    @Override
    public List<Moves> moves() {
        return State.getMoves(this);
    }
    
}
