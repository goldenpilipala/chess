package chess.PieceMoveRules;

import chess.*;

import java.util.ArrayList;

public class BishopMoveRules {
    //TODO: How to check to see if another piece is in the way

    private static ArrayList<ChessMove> validMoves;

    public static ArrayList<ChessMove> validRules(ChessBoard board, ChessPosition original_pos) {

        validMoves = new ArrayList<>();

        ChessPiece.PieceType bishop = ChessPiece.PieceType.BISHOP;

        System.out.println("Original position: (" + original_pos.getRow() + ", " + original_pos.getColumn() + ")");
        System.out.println("Possible positions: ");

        addMoves(original_pos, bishop, -1, -1);
        addMoves(original_pos, bishop, -1, +1);
        addMoves(original_pos, bishop, +1, -1);
        addMoves(original_pos, bishop, +1, +1);


        return validMoves;
    }

    private static void addMoves(ChessPosition original_pos, ChessPiece.PieceType piece, int colShift, int rowShift){
        int curr_x = original_pos.getColumn();
        int curr_y = original_pos.getRow();
        while(true){
            curr_x += colShift;
            curr_y += rowShift;

            if(MoveRules.isOnBoard(curr_y, curr_x) && !MoveRules.isBlocked(curr_y, curr_x)) {
                validMoves.add(new ChessMove(original_pos, new ChessPosition(curr_y, curr_x), piece));
                System.out.println("(" + curr_y + ", " + curr_x + ")");
            }
            else break;
        }
    }

}