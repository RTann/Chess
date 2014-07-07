package com.play.chess;

import com.game.chess.Game;
import java.util.Arrays;

/**
 * Builds a game of Chess
 */
public class Play {

    /**
     * Plays a game of Chess
     * 
     * @param args the command line arguments (Optional). Format: Player1name
     * Player2name
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        if (args.length == 2) {
            Game game = new Game(args[0], args[1]);
            game.play();
        } else {
            System.exit(0);
        }
    }
    
}
