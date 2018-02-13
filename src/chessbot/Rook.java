
package chessbot;

public class Rook extends Piece {

    Rook(Piece [][] board, String black, int i, int j) {
        super(board, black, i, j);
    }


    
    public boolean legal(int x, int y) {
    	boolean legal= false;
    	if (this.x == x || this.y == y)
    		legal = true;
    	return legal;
    }

}
