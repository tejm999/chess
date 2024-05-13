import org.junit.Test;
import static org.junit.Assert.*;

public class rooktest {

    @Test
    public void testPossibleMove() {
        // Create a white rook at position (0, 0)
        Rook rook = new Rook(Color.WHITE, "Rook", 0, 0);

        // Test a valid move
        assertTrue(rook.possibleMove(0, 5)); // Vertical move
        assertTrue(rook.possibleMove(5, 0)); // Horizontal move

        // Test an invalid move
        assertFalse(rook.possibleMove(3, 3)); // Diagonal move
    }

    @Test
    public void testCanMove() {
        // Create a white rook at position (3, 3)
        Rook rook = new Rook(Color.WHITE, "Rook", 3, 3);

        // Test if the rook can move
        assertTrue(rook.canMove()); // Rook can move in all directions from (3, 3)

        // Test if the rook can move after blocking its path vertically
        assertTrue(rook.possibleMove(3, 5)); // Attempt to move vertically

        // Test if the rook can move after blocking its path horizontally
        assertTrue(rook.possibleMove(5, 3)); // Attempt to move horizontally
    }
}
