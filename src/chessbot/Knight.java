
package chessbot;

public class Knight extends Piece {

    Knight(Piece [][] board, String black, int i, int j) {
       super(board, black, i, j);
    }

    @Override
    public void move(int x,int y) {
    	if (this.legal())
    	this.x = x;
    	this.y = y;
    }
    
    public boolean legal(int x, int y) {
    	boolean legal = false;
    	if((Math.abs(this.x-x)==2 
    			&& Math.abs(this.y-y)==1)
    			|| (Math.abs(this.y-y)==2 
    			&& Math.abs(this.x-x)==1))
    		legal = true;
    	return legal;
    }

}
