package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;


    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    // Apenas o get, pois não precisa alterar as cores do Color
    public Color getColor() {
        return color;
    }
}
