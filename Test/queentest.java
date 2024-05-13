import org.junit.Test;
import static org.junit.Assert.*;

public class queentest {

    @Test
    public void testPossibleMove() {
        // Create a white queen at position (3, 3)
        Queen queen = new Queen(Color.WHITE, "Queen", 3, 3);

        // Test valid moves
        assertTrue(queen.possibleMove(6, 0)); // Diagonal move
        assertTrue(queen.possibleMove(2, 3)); // Horizontal move
        assertTrue(queen.possibleMove(3, 2)); // Vertical move
    }

    @Test
    public void testCanMove() {
        // Create a white queen at position (3, 3)
        Queen queen = new Queen(Color.WHITE, "Queen", 3, 3);

        // Test if the queen can move
        assertTrue(queen.canMove()); // Queen can move in all directions from (3, 3)

    }
}
