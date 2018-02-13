package chessbot;

public class Board {
	
	

    Piece[][] board = new Piece[8][8];
/*
        ij
        00 01 02 03 04 05 06 07
        10 11 12 13 14 15 16 17
         */
    
    public Board() {       
        //Create all pieces
        board[0][0] = new Rook("black", 0, 0);
        board[0][1] = new Knight("black", 0, 1);
        board[0][2] = new Bishop("black", 0, 2);
        board[0][3] = new Queen("black", 0, 3);
        board[0][4] = new King("black", 0, 4);
        board[0][5] = new Bishop("black", 0, 5);
        board[0][6] = new Knight("black", 0, 6);
        board[0][7] = new Rook("black", 0, 7);

        board[7][0] = new Rook("white", 0, 0);
        board[7][1] = new Knight("white", 0, 1);
        board[7][2] = new Bishop("white", 0, 2);
        board[7][3] = new Queen("white", 0, 3);
        board[7][4] = new King("white", 0, 4);
        board[7][5] = new Bishop("white", 0, 5);
        board[7][6] = new Knight("white", 0, 6);
        board[7][7] = new Rook("white", 0, 7);

        for (int j = 0; j < 8; j++) {
            board[1][j] = new Pawn("black", 1, j);
            board[6][j] = new Pawn("white", 6, j);
        }

        //Printing everything
        for (Piece[] a : board) {
            for (Piece b : a) {
                if (a != null) {
                    System.out.println(b);
                }
                System.out.println();

            }
        }
    }
    
}
