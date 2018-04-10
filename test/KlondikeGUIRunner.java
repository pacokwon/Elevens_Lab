/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class KlondikeGUIRunner {

    /**
     * Plays the GUI version of Elevens.
     * @param args is not used.
     */
    public static void main(String[] args) {
        // Board board = new ElevensBoard();
        KlondikeBoard board = new KlondikeBoard();
        KlondikeGUI2 gui = new KlondikeGUI2(board);
        gui.displayGame();
        // gui.showCoords();

        // for (int i = 0; i < board.size(); i++) {
        //     for (int j = 0; j < board.pileSize(i); j++) {
        //         System.out.println(board.piles[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}