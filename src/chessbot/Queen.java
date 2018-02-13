package chessbot;

public class Queen extends Piece {

    public Queen(Piece [][] board, String colour, int x, int y) {
        super(board, colour, x, y);
    }

    
    @Override
    public void move(int x,int y) {
    	if (this.legal())
    	this.x = x;
    	this.y = y;
    }
    
    public boolean legal(int x, int y) {
    	boolean legal = false;
    	if (this.x == x || this.y == y)
    		legal = true;
    	if (Math.abs(this.x-x)==Math.abs(this.y-y))
    		legal = true;
    	return legal;
    }

}
