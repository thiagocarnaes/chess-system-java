package courses.chess.pieces;

import courses.boardgame.Board;
import courses.chess.ChessPiece;
import courses.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
    
}