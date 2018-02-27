package chessbot;

public class Queen extends Piece {

    public Queen(String colour, int x, int y) {
        super(colour, x, y);
    }

    public boolean legal(int x, int y) {
        return ((this.x == x && this.y != y) // legal to move on the x axis
                || (this.y == y && this.x != x) //legal to move on the y axis
                || (Math.abs(this.x - x) == Math.abs(this.y - y))); // legal to move diagonally
    }

    

}
