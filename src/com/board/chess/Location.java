package com.board.chess;

/**
 * Each instance represents a location on a Chess <code>Board</code>
 */
public class Location {

    /**
     * This <code>Location</code>'s row and column
     */
    private final int row, column;

    /**
     * The <code>Tile</code> that is at this <code>Location</code>
     */
    private final Tile tile;

    /**
     * Instantiates a <code>Location</code> with a row, column, and
     * <code>Tile</code>
     *
     * @param r Row on the <code>Board</code>
     * @param c Column on the <code>Board</code>
     * @param t <code>Tile</code> that lies at this <code>Location</code>
     */
    public Location(int r, int c, Tile t) {
        row = r;
        column = c;
        tile = t;
    }

    /**
     * Returns the column
     *
     * @return Column
     */
    public int column() {
        return column;
    }

    /**
     * Return the row
     *
     * @return Row
     */
    public int row() {
        return row;
    }

    /**
     * Returns the <code>Tile</code> that lies at this <code>Location</code>
     *
     * @return <code>Tile</code> at this <code>Location</code>
     */
    public Tile tile() {
        return tile;
    }

}
