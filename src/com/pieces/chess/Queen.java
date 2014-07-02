package com.pieces.chess;

import com.amf.structures.list.List;
import com.game.chess.State;
import com.moves.chess.Moves;
import com.types.chess.Type;
import static com.types.chess.Type.WHITE;

public class Queen extends Piece {

    public Queen(Type t) {
        super(t);
        tile = t == WHITE ? null : null;
    }
    
    @Override
    public List<Moves> moves() {
        return State.getMoves(this);
    }
    
}
