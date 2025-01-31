package chess.PieceMoveRules;

import chess.ChessMove;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;

public class MoveRules {

    public static void addMoves(ChessPosition original_pos, ChessPiece.PieceType piece,
                                 ArrayList<ChessMove> validMoves, int colShift, int rowShift){
        int curr_x = original_pos.getColumn();
        int curr_y = original_pos.getRow();
        while(true){
            curr_x += colShift;
            curr_y += rowShift;

            if(MoveRules.isOnBoard(curr_y, curr_x) && !MoveRules.isBlocked(piece, curr_y, curr_x)) {
                validMoves.add(new ChessMove(original_pos, new ChessPosition(curr_y, curr_x), null));
                System.out.println("(" + curr_y + ", " + curr_x + ")");
            }
            else break;
        }
    }

    public static boolean isOnBoard(int y, int x) {
        return x >= 1 && y >= 1 && x <= 8 && y <= 8;
    }

    public static boolean isBlocked(ChessPiece.PieceType piece, int y, int x) {
        if(piece == ChessPiece.PieceType.BISHOP)
            return BishopMoveRules.isBishopBlocked();

        return false;
    }
}
