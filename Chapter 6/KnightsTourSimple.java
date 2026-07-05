//.6.21java
public class KnightsTourSimple {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        
        // Vertical and horizontal component arrays for the 8 valid knight moves
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

        // Starting point values
        int currentRow = 0;
        int currentCol = 0;
        board[currentRow][currentCol] = 1;
        int moveCount = 1;

        System.out.println("Beginning basic logic Knight's Tour from (0,0)...");
        
        // Greedy approach loop attempting moves sequentially
        for (int moveNumber = 2; moveNumber <= 64; moveNumber++) {
            boolean moveMade = false;
            for (int moveType = 0; moveType < 8; moveType++) {
                int testRow = currentRow + vertical[moveType];
                int testCol = currentCol + horizontal[moveType];

                if (testRow >= 0 && testRow < 8 && testCol >= 0 && testCol < 8 && board[testRow][testCol] == 0) {
                    currentRow = testRow;
                    currentCol = testCol;
                    board[currentRow][currentCol] = moveNumber;
                    moveCount++;
                    moveMade = true;
                    break;
                }
            }
            if (!moveMade) break;
        }

        System.out.printf("Tour ended after %d moves.%n%n", moveCount);
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                System.out.printf("%3d", board[r][c]);
            }
            System.out.println();
        }
    }
}
