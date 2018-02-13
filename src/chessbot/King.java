
package chessbot;

public class King extends Piece {

    public King(Piece [][] board, String colour, int x, int y) {
        super(board, colour, x, y);
    }

   //Move method
    public void move(int x,int y) {
    	if (this.legal())
    	this.x = x;
    	this.y = y;
    }

    //check if legal
    public boolean legal(int x, int y) {
    	boolean legal = false;
    	if(Math.abs(this.x-x) == 1|| Math.abs(this.y-y)==1)
    			legal= true;
    	return legal;
    }
    
    
}
