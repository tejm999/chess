
public class Queen extends Piece {

    public Queen(Color color, String ID, int startX, int startY) {
        super(color, ID, startX, startY);
    }

    @Override
    public boolean possibleMove(int x, int y) {
        // cannot capture own piece
        if (this.sameColor(Board.getPiece(x, y)) == true) {
            return false;
        }
        // obstruction
        if (Board.isPathClear(getX(), getY(), x, y) != true) {
            return false;
        }
        // bishop
        if (Math.abs(getX() - x) == Math.abs(getY() - y)) { // bishop
            return true;
        }
        // rook
        if (Math.abs(getX() - x) != 0 && Math.abs(getY() - y) == 0
                || Math.abs(getX() - x) == 0 && Math.abs(getY() - y) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.getColor() == Color.WHITE) {
            return "♕";
        }
        return "♛";
    }

    @Override
    public boolean canMove() {

        int x = this.getX();
        int y = this.getY();

        // bishop
        // top left
        while ((--x) >= 0 && (--y) >= 0) {
            if (this.testMove(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // top right
        while ((++x) <= 7 && (--y) >= 0) {
            if (this.testMove(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // bottom left
        while ((--x) >= 0 && (++y) <= 7) {
            if (this.testMove(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // bottom right
        while ((++x) <= 7 && (++y) <= 7) {
            if (this.testMove(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // rook
        // left
        while ((--x) >= 0 && y >= 0) {
            if (this.testMove(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // right
        while ((++x) <= 7 && y >= 0) {
            if (this.testMove(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // down
        while (x >= 0 && (++y) <= 7) {
            if (this.testMove(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // up
        while (x <= 7 && (--y) >= 0) {
            if (this.testMove(x, y)) {
                return true;
            }
        }
        return false;
    }

}