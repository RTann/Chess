package com.board.chess;

public class Location {
    
    private final int row, column;
    
    public Location(int r, int c) {
        row = r;
        column = c;
    }
    
    public int column() {
        return column;
    }
    
    public int row() {
        return row;
    }
    
}
