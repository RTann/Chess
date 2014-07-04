package com.moves.chess;

import com.amf.structures.list.LinkedList;
import com.amf.structures.list.List;

/**
 * All of the possible moves on a Chess <code>Board</code> in Cardinal
 * directions (not including <code>Knight</code> specific moves)
 */
public enum Moves {

    /**
     * All of the possible moves in Chess by Cardinal direction
     */
    E1(+0, +1), E2(+0, +2), E3(+0, +3), E4(+0, +4), E5(+0, +5), E6(+0, +6), E7(+0, +7),
    K1(-2, +1), K2(-1, +2), K3(+1, +2), K4(+2, +1), K5(+2, -1), K6(+1, -2), K7(-1, -2), K8(-2, -1),
    N1(-1, +0), N2(-2, +0), N3(-3, +0), N4(-4, +0), N5(-5, +0), N6(-6, +0), N7(-7, +0),
    NE1(-1, +1), NE2(-2, +2), NE3(-3, +3), NE4(-4, +4), NE5(-5, +5), NE6(-6, +6), NE7(-7, +7),
    NW1(-1, -1), NW2(-2, -2), NW3(-3, -3), NW4(-4, -4), NW5(-5, -5), NW6(-6, -6), NW7(-7, -7),
    S1(+1, +0), S2(+2, +0), S3(+3, +0), S4(+4, +0), S5(+5, +0), S6(+6, +0), S7(+7, +0),
    SE1(+1, +1), SE2(+2, +2), SE3(+3, +3), SE4(+4, +4), SE5(+5, +5), SE6(+6, +6), SE7(+7, +7),
    SW1(+1, -1), SW2(+2, -2), SW3(+3, -3), SW4(+4, -4), SW5(+5, -5), SW6(+6, -6), SW7(+7, -7),
    W1(+0, -1), W2(+0, -2), W3(+0, -3), W4(+0, -4), W5(+0, -5), W6(+0, -6), W7(+0, -7);

    /**
     * Each move's change of row and column on the <code>Board</code>
     */
    public final int dRow, dCol;

    /**
     * Each move sorted into a <code>List</code> of its own category
     */
    private static final List<Moves> east = makeEast(),
            knight = makeKnight(),
            north = makeNorth(),
            northEast = makeNorthEast(),
            northWest = makeNorthWest(),
            south = makeSouth(),
            southEast = makeSouthEast(),
            southWest = makeSouthWest(),
            west = makeWest();

    /**
     * Instantiates a move's change in row and colum
     */
    private Moves(int dRow, int dCol) {
        this.dRow = dRow;
        this.dCol = dCol;
    }

    /**
     * Returns all of the moves in the East direction
     *
     * @return <code>List</code> of moves in East direction
     */
    public static List<Moves> east() {
        return east;
    }

    /**
     * Returns all of the moves a <code>Knight</code> can do
     *
     * @return <code>List</code> of moves a <code>Knight</code> can do
     */
    public static List<Moves> knight() {
        return knight;
    }

    /**
     * Returns all of the moves in the East direction
     *
     * @return <code>List</code> of moves in East direction
     */
    private static List<Moves> makeEast() {
        List<Moves> e = new LinkedList<>();
        e.append(E1);
        e.append(E2);
        e.append(E3);
        e.append(E4);
        e.append(E5);
        e.append(E6);
        e.append(E7);
        return e;
    }

    /**
     * Returns all of the moves a <code>Knight</code> can do
     *
     * @return <code>List</code> of moves a <code>Knight</code> can do
     */
    private static List<Moves> makeKnight() {
        List<Moves> k = new LinkedList<>();
        k.append(K1);
        k.append(K2);
        k.append(K3);
        k.append(K4);
        k.append(K5);
        k.append(K6);
        k.append(K7);
        k.append(K8);
        return k;
    }

    /**
     * Returns all of the moves in the North direction
     *
     * @return <code>List</code> of moves in North direction
     */
    private static List<Moves> makeNorth() {
        List<Moves> n = new LinkedList<>();
        n.append(N1);
        n.append(N2);
        n.append(N3);
        n.append(N4);
        n.append(N5);
        n.append(N6);
        n.append(N7);
        return n;
    }

    /**
     * Returns all of the moves in the North East direction
     *
     * @return <code>List</code> of moves in North East direction
     */
    private static List<Moves> makeNorthEast() {
        List<Moves> ne = new LinkedList<>();
        ne.append(NE1);
        ne.append(NE2);
        ne.append(NE3);
        ne.append(NE4);
        ne.append(NE5);
        ne.append(NE6);
        ne.append(NE7);
        return ne;
    }

    /**
     * Returns all of the moves in the North West direction
     *
     * @return <code>List</code> of moves in North West direction
     */
    private static List<Moves> makeNorthWest() {
        List<Moves> nw = new LinkedList<>();
        nw.append(NW1);
        nw.append(NW2);
        nw.append(NW3);
        nw.append(NW4);
        nw.append(NW5);
        nw.append(NW6);
        nw.append(NW7);
        return nw;
    }

    /**
     * Returns all of the moves in the South direction
     *
     * @return <code>List</code> of moves in South direction
     */
    private static List<Moves> makeSouth() {
        List<Moves> s = new LinkedList<>();
        s.append(S1);
        s.append(S2);
        s.append(S3);
        s.append(S4);
        s.append(S5);
        s.append(S6);
        s.append(S7);
        return s;
    }

    /**
     * Returns all of the moves in the South East direction
     *
     * @return <code>List</code> of moves in South East direction
     */
    private static List<Moves> makeSouthEast() {
        List<Moves> se = new LinkedList<>();
        se.append(SE1);
        se.append(SE2);
        se.append(SE3);
        se.append(SE4);
        se.append(SE5);
        se.append(SE6);
        se.append(SE7);
        return se;
    }

    /**
     * Returns all of the moves in the South West direction
     *
     * @return <code>List</code> of moves in South West direction
     */
    private static List<Moves> makeSouthWest() {
        List<Moves> sw = new LinkedList<>();
        sw.append(SW1);
        sw.append(SW2);
        sw.append(SW3);
        sw.append(SW4);
        sw.append(SW5);
        sw.append(SW6);
        sw.append(SW7);
        return sw;
    }

    /**
     * Returns all of the moves in the West direction
     *
     * @return <code>List</code> of moves in West direction
     */
    private static List<Moves> makeWest() {
        List<Moves> w = new LinkedList<>();
        w.append(W1);
        w.append(W2);
        w.append(W3);
        w.append(W4);
        w.append(W5);
        w.append(W6);
        w.append(W7);
        return w;
    }

    /**
     * Returns all of the moves in the North direction
     *
     * @return <code>List</code> of moves in North direction
     */
    public static List<Moves> north() {
        return north;
    }

    /**
     * Returns all of the moves in the North East direction
     *
     * @return <code>List</code> of moves in North East direction
     */
    public static List<Moves> northEast() {
        return northEast;
    }

    /**
     * Returns all of the moves in the North West direction
     *
     * @return <code>List</code> of moves in North West direction
     */
    public static List<Moves> northWest() {
        return northWest;
    }

    /**
     * Returns all of the moves in the South direction
     *
     * @return <code>List</code> of moves in South direction
     */
    public static List<Moves> south() {
        return south;
    }

    /**
     * Returns all of the moves in the South East direction
     *
     * @return <code>List</code> of moves in South East direction
     */
    public static List<Moves> southEast() {
        return southEast;
    }

    /**
     * Returns all of the moves in the South West direction
     *
     * @return <code>List</code> of moves in South West direction
     */
    public static List<Moves> southWest() {
        return southWest;
    }

    /**
     * Returns all of the moves in the West direction
     *
     * @return <code>List</code> of moves in West direction
     */
    public static List<Moves> west() {
        return west;
    }

}
