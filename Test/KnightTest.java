import org.junit.Test;
import static org.junit.Assert.*;

public class KnightTest {

    @Test
    public void testPossibleMove() {
        // Create a board instance
        Board.startGame();

        // Create a white knight at position (3, 3)
        Knight knight = new Knight(Color.WHITE, "Knight", 3, 3);

        // Place pieces on different squares for testing
        Board.setPiece(1, 2, null); // Empty square at (1, 2)
        Board.setPiece(2, 1, new Piece(Color.BLACK, "Blocker1", 2, 1) {
            @Override
            public boolean possibleMove(int x, int y) {
                return false;
            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public boolean canMove() {
                return false;
            }
        }); // Black piece at (2, 1)

        // Test valid moves
        assertTrue(knight.possibleMove(1, 2)); // Capture black piece at (1, 2)
        assertTrue(knight.possibleMove(2, 1)); // Capture black piece at (2, 1)
        assertFalse(knight.possibleMove(5, 1)); // Move to empty square at (5, 1)

        // Test invalid moves
        assertFalse(knight.possibleMove(3, 3)); // Stay in place
        assertFalse(knight.possibleMove(2, 2)); // Diagonal move
        assertFalse(knight.possibleMove(4, 4)); // Move more than L-shape
        assertFalse(knight.possibleMove(6, 3)); // Move horizontally
        assertFalse(knight.possibleMove(3, 6)); // Move vertically
        assertTrue(knight.possibleMove(4, 1)); // Move to square occupied by white piece
    }

    @Test
    public void testCanMove() {
        // Create a board instance
        Board.startGame();

        // Create a white knight at position (3, 3)
        Knight knight = new Knight(Color.WHITE, "Knight", 3, 3);

        // Place pieces blocking the knight's path
        Board.setPiece(1, 2, null); // Empty square at (1, 2)
        Board.setPiece(2, 1, new Piece(Color.BLACK, "Blocker1", 2, 1) {
            @Override
            public boolean possibleMove(int x, int y) {
                return false;
            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public boolean canMove() {
                return false;
            }
        }); // Black piece at (2, 1)

        // Test if the knight can move
        assertTrue(knight.canMove()); // Knight can move to multiple squares

        // Remove the blockers
        Board.setPiece(1, 2, null);
        Board.setPiece(2, 1, null);

    }
}
