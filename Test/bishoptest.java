import org.junit.Test;
import static org.junit.Assert.*;

public class bishoptest {

    @Test
    public void testPossibleMove() {
        // Create a white bishop at position (3, 3)
        Bishop bishop = new Bishop(Color.WHITE, "Bishop", 3, 3);

        // Test a valid move
        assertFalse(bishop.possibleMove(0, 0)); // Diagonal move
        assertTrue(bishop.possibleMove(6, 0)); // Diagonal move

        // Test an invalid move
        assertFalse(bishop.possibleMove(3, 5)); // Vertical move
        assertFalse(bishop.possibleMove(5, 3)); // Horizontal move
    }

    @Test
    public void testCanMove() {
        // Create a white bishop at position (3, 3)
        Bishop bishop = new Bishop(Color.WHITE, "Bishop", 3, 3);

        // Test if the bishop can move
        assertTrue(bishop.canMove()); // Bishop can move in all diagonal directions from (3, 3)

        // Test if the bishop can move after blocking its path
        assertFalse(bishop.possibleMove(0, 0)); // Attempt to move to a blocked position
    }
}
