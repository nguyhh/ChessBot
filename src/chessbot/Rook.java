
package chessbot;

public class Rook extends Piece {

    Rook(String black, int i, int j) {
        super(black, i, j);
    }


    
    public boolean legal(int x, int y) {
       return true;
//        //Base case
//        if(!isPathClear(x, y))
//        if (x == this.x + 1  || isPathClear(x, y))return true;
//        else if (Math.abs(x - this.x) != 1) legal(x-1, y);
//        
//        
////    	return ((this.x == x && this.y != y) // legal to move only on  the x axis
////                || (this.y == y && this.x != x)); //legal to move only the y axis
    }

}
