package chess;

import java.util.Objects;

/**
 * Represents moving a chess piece on a chessboard.
 */
public class ChessMove {

    private final ChessPosition start_pos;
    private final ChessPosition end_pos;
    private final ChessPiece.PieceType promo_piece;

    public ChessMove(ChessPosition startPosition, ChessPosition endPosition,
                     ChessPiece.PieceType promotionPiece) {
        start_pos = startPosition;
        end_pos = endPosition;
        promo_piece = promotionPiece;
    }

    /**
     * @return ChessPosition of starting location
     */
    public ChessPosition getStartPosition() {
        return start_pos;
    }

    /**
     * @return ChessPosition of ending location
     */
    public ChessPosition getEndPosition() {
        return end_pos;
    }

    /**
     * Gets the type of piece to promote a pawn to if pawn promotion is part of this
     * chess move
     *
     * @return Type of piece to promote a pawn to, or null if no promotion
     */
    public ChessPiece.PieceType getPromotionPiece() {
         return promo_piece;
    }

    @Override
    public String toString() {
        return "ChessMove{" +
                "start_pos=" + start_pos +
                ", end_pos=" + end_pos +
                ", promo_piece=" + promo_piece +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessMove chessMove = (ChessMove) o;
        return Objects.equals(start_pos, chessMove.start_pos) && Objects.equals(end_pos, chessMove.end_pos) && promo_piece == chessMove.promo_piece;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start_pos, end_pos, promo_piece);
    }
}
