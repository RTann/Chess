package com.board.chess;

import com.types.chess.Type;

public class Tile {
   
    private final Location location;
    
    private final Type type;
    
    private TileState state;
    
    public Tile(Location l, Type t) {
        location = l;
        type = t;
    }
    
    public Location location() {
        return location;
    }
    
    public TileState state() {
        return state;
    }
    
    public Type type() {
        return type;
    }
    
    public void updateState() {
        //TODO
    }
    
}
