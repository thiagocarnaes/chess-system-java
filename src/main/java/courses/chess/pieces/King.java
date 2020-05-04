package courses.chess.pieces;

import courses.boardgame.Board;
import courses.chess.ChessPiece;
import courses.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
    
}