package chess.PieceMoveRules;

import chess.*;

import java.util.ArrayList;

public class BishopMoveRules {
    //TODO: How to check to see if another piece is in the way
    //TODO: Combine all diagonal motions into one function

    private static ArrayList<ChessMove> validMoves;

    public static ArrayList<ChessMove> validRules(ChessBoard board, ChessPosition original_pos) {

        validMoves = new ArrayList<>();

        ChessPiece.PieceType bishop = ChessPiece.PieceType.BISHOP;

        int original_x = original_pos.getColumn();
        int original_y = original_pos.getRow();

        System.out.println("Original position: (" + original_y + ", " + original_x + ")");
        System.out.println("Possible positions: ");

        //Up Left
        int curr_x = original_x;
        int curr_y = original_y;
        while(true){
            curr_x--;
            curr_y--;

            if(isOnBoard(curr_y, curr_x) && !isBlocked(curr_y, curr_x)) {
                validMoves.add(new ChessMove(original_pos, new ChessPosition(curr_y, curr_x), bishop));
                System.out.println("(" + curr_y + ", " + curr_x + ")");
            }
            else break;
        }

        //Up Right
        curr_x = original_x;
        curr_y = original_y;
        while(true){
            curr_x--;
            curr_y++;

            if(isOnBoard(curr_y, curr_x) && !isBlocked(curr_y, curr_x)) {
                validMoves.add(new ChessMove(original_pos, new ChessPosition(curr_y, curr_x), bishop));
                System.out.println("(" + curr_y + ", " + curr_x + ")");
            }
            else break;
        }

        //Down Left
        curr_x = original_x;
        curr_y = original_y;
        while(true){
            curr_x++;
            curr_y--;

            if(isOnBoard(curr_y, curr_x) && !isBlocked(curr_y, curr_x)) {
                validMoves.add(new ChessMove(original_pos, new ChessPosition(curr_y, curr_x), bishop));
                System.out.println("(" + curr_y + ", " + curr_x + ")");
            }
            else break;
        }

        //Down Right
        curr_x = original_x;
        curr_y = original_y;
        while(true){
            curr_x++;
            curr_y++;

            if(isOnBoard(curr_y, curr_x) && !isBlocked(curr_y, curr_x)) {
                validMoves.add(new ChessMove(original_pos, new ChessPosition(curr_y, curr_x), bishop));
                System.out.println("(" + curr_y + ", " + curr_x + ")");
            }
            else break;
        }

        return validMoves;
    }

    private static boolean isOnBoard(int y, int x) {
        return x >= 1 && y >= 1 && x <= 8 && y <= 8;
    }

    private static boolean isBlocked(int y, int x) {
        return false;
    }
}