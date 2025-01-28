package chess.PieceMoveRules;

public class MoveRules {

    public static boolean isOnBoard(int y, int x) {
        return x >= 1 && y >= 1 && x <= 8 && y <= 8;
    }

    public static boolean isBlocked(int y, int x) {
        return false;
    }
}
