package chessbot;


public class Pawn extends Piece{

    public Pawn(Piece[][] board, String colour, int x, int y) {
        super(board, colour, x, y);
    }

    //legal or not
    public boolean legal(int x, int y) {
    	boolean legal = false;
    	
    	if(this.colour=="black") {
    		if(this.x==1)
    			if(x-this.x==2)
    				legal=true;
    		if(x-this.x==1)
    			legal=true;
    	}
    	
    	if(this.colour=="white") {
    		if(this.x==6)
    			if(this.x-x==2)
    				legal=true;
    		if(this.x-x==1)
    			legal=true;
    	}		
    	return legal;
    }


    //no idea how to make this...?
    public int[][] possibleposition() {
    	int [][] listPosition;
    	
    	
    	
    	return listPosition;
    }

}
