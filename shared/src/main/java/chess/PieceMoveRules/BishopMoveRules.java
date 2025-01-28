package chess.PieceMoveRules;

import chess.*;

import java.util.ArrayList;

public class BishopMoveRules {
    //TODO: How to check to see if another piece is in the way

    public static ArrayList<ChessMove> validRules(ChessBoard board, ChessPosition original_pos) {

        ArrayList<ChessMove> validMoves = new ArrayList<>();

        ChessPiece.PieceType bishop = ChessPiece.PieceType.BISHOP;

        System.out.println("Original position: (" + original_pos.getRow() + ", " + original_pos.getColumn() + ")");
        System.out.println("Possible positions: ");

        MoveRules.addMoves(original_pos, bishop, validMoves, -1, -1);
        MoveRules.addMoves(original_pos, bishop, validMoves, -1, +1);
        MoveRules.addMoves(original_pos, bishop, validMoves, +1, -1);
        MoveRules.addMoves(original_pos, bishop, validMoves, +1, +1);

        return validMoves;
    }


}