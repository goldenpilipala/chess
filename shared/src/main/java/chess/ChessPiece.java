package chess;

import java.util.ArrayList;
import java.util.Collection;

import chess.PieceMoveRules.*;

/**
 * Represents a single chess piece
 */
public class ChessPiece {

    private final ChessGame.TeamColor piece_color;
    private final PieceType piece_type;


    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        piece_color = pieceColor;
        piece_type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {

        return piece_color;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {

        return piece_type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        return switch (piece_type) {
            case KING -> KingMoveRules.validRules(board, myPosition);
            case QUEEN -> QueenMoveRules.validRules(board, myPosition);
            case BISHOP -> BishopMoveRules.validRules(board, myPosition);
            case KNIGHT -> KnightMoveRules.validRules(board, myPosition);
            case ROOK -> RookMoveRules.validRules(board, myPosition);
            case PAWN -> PawnMoveRules.validRules(board, myPosition);
        };
    }
}
