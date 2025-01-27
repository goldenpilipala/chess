package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {

    public final int row;
    public final int col;

    public ChessPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //Getter methods return the row and column already accounting for the fact that arrays start at 0

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow() {
        return row - 1;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn() {
        return col - 1;
    }

    @Override
    public String toString() {
        return "Chess Position:\n  Row: " + (row-1) + "\nColumn: " + (col-1);
    }
}
