
package chessbot;

public class Bishop extends Piece {

    Bishop(Piece [][] board, String black, int i, int i0) {
        super(board, black, i, i0);
    }

    
    @Override
    public void move(int x,int y) {
    	if (this.legal())
    	this.x = x;
    	this.y = y;
    }
    
    public boolean legal(int x, int y) {
    	boolean legal = false;
    	if (Math.abs(this.x-x)==Math.abs(this.y-y))
    		legal = true;
    	return legal;
    		
    }

}
