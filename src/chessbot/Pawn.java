package chessbot;

public class Pawn extends Piece {

    public Pawn(String colour, int x, int y) {
        super(colour, x, y);
    }

    //legal or not
    public boolean legal(int x, int y) {
        boolean legal = false;

        if (this.colour == "black") {
            /*
            1.Only legal to move along y
            2. if initia position, then legal to move to move 2 
            3. else move 1;
             */

            return ((this.x == 1 && (x - this.x) == 2 && isPathClear(x + 1, y)|| (x - this.x == 1))
                    && (this.y == y)
                    && (isPathClear(x, y)));
        } else {

            return ((this.x == 6 && (this.x - x) == 2&& isPathClear(x - 1, y) || (this.x - x == 1))
                    && (this.y == y)
                    && (isPathClear(x, y)));
        }
    }
}
