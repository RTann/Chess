package com.board.chess;

import com.types.chess.Type;

public class Tile {
   
    private Location location;
    
    private Type type;
    
    public Tile(Location l, Type t) {
        location = l;
        type = t;
    }
    
    public Location location() {
        return location;
    }
    
    public Type type() {
        return type;
    }
    
}
