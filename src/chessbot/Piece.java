
package chessbot;

public abstract class Piece {
    String name = this.getClass().getSimpleName();
    String colour;   
    int x;
    int y;
    public abstract void  move();
    
    public Piece(){
    name = this.getClass().getSimpleName();
    }

    public Piece(String colour, int x, int y) {
        this.colour = colour;
        this.x = x;
        this.y = y;
        name = this.getClass().getSimpleName();
    }
    
    
    public String toString(){
//    return this.getClass().getName();
return  name + " \n" + colour + "\n" + x + " " + y;
    }
}
