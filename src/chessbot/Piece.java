
package chessbot;

public abstract class Piece {
    String name = this.getClass().getSimpleName();
    String colour;   
    int x;
    int y;
    Piece[][] board;
    
    public abstract int[][] possibleposition();
    
    public void move(int x,int y) {
    	if (this.legal()) {
    		board[this.x][this.y] = null;
    		board[x][y] = this;
    		
    		this.x = x;
        	this.y = y;
    	}
    	
    }
    
    
    public abstract boolean legal();//check if legal or not
    
    public Piece(){
    name = this.getClass().getSimpleName();
    }

    public Piece(Piece[][] board, String colour, int x, int y) {
        this.board = board;
    	this.colour = colour;
        this.x = x;
        this.y = y;
        name = this.getClass().getSimpleName();
    }
    
    
    public String toString(){
//    return this.getClass().getName();
return  name + " \n" + colour + "\n" + x + " " + y;
    }
    
    //Check if still in the board or not
    public boolean inBoard(int x, int y) {
    	if (x>=0 &&x<8 &&y>=0&& y<8)
    		return true;
    	else
    		return false;
    };
}
