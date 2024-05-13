import static org.junit.Assert.*;
import org.junit.Test;

public class KingTest {

    @Test
    public void testPossibleMove() {
        King king = new King(Color.WHITE, "king", 4, 4);

        // Test valid moves
        assertTrue(king.possibleMove(3, 3));
        assertTrue(king.possibleMove(3, 4));
        assertTrue(king.possibleMove(3, 5));
        assertTrue(king.possibleMove(4, 3));
        assertTrue(king.possibleMove(4, 5));
        assertTrue(king.possibleMove(5, 3));
        assertTrue(king.possibleMove(5, 4));
        assertTrue(king.possibleMove(5, 5));

        // Test invalid moves
        assertFalse(king.possibleMove(4, 4)); // Stay in place
        assertFalse(king.possibleMove(2, 2)); // Diagonal too far
        assertFalse(king.possibleMove(4, 7)); // Vertical too far
        assertFalse(king.possibleMove(7, 4)); // Horizontal too far
    }

    // Add more test methods as needed for other functionalities of the King class
}
