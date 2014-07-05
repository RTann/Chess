package com.board.chess;

public class Location {
    
    private final int row, column;
    
    private final Tile tile;
    
    public Location(int r, int c, Tile t) {
        row = r;
        column = c;
        tile = t;
    }
    
    public int column() {
        return column;
    }
    
    public int row() {
        return row;
    }
    
    public Tile tile() {
        return tile;
    }
    
}
