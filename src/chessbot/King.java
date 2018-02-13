
package chessbot;

public class King extends Piece {

    public King(Piece [][] board, String colour, int x, int y) {
        super(board, colour, x, y);
    }

    //check if legal
    public boolean legal(int x, int y) {
    	boolean legal = false;
    	if(Math.abs(this.x-x) == 1|| Math.abs(this.y-y)==1)
    			legal= true;
    	return legal;
    }
    
    
}
