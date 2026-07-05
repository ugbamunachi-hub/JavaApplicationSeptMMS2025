//6.20java
import java.util.Scanner;

public class TurtleGraphics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] floor = new int[20][20];
        
        int currentRow = 0;
        int currentCol = 0;
        boolean penDown = false;
        
        // Directions: 0 = Right, 1 = Down, 2 = Left, 3 = Up
        int direction = 0; 

        System.out.println("Enter turtle graphic commands (9 to execute/exit):");
        
        while (true) {
            System.out.print("Command: ");
            String commandInput = input.next();
            String[] tokens = commandInput.split(",");
            int command = Integer.parseInt(tokens[0]);

            if (command == 9) break;

            switch (command) {
                case 1:
                    penDown = false;
                    break;
                case 2:
                    penDown = true;
                    break;
                case 3:
                    direction = (direction + 1) % 4; // Turn right
                    break;
                case 4:
                    direction = (direction + 3) % 4; // Turn left
                    break;
                case 5:
                    int steps = Integer.parseInt(tokens[1]);
                    for (int s = 0; s < steps; s++) {
                        if (penDown) {
                            floor[currentRow][currentCol] = 1;
                        }
                        
                        if (direction == 0 && currentCol < 19) currentCol++;
                        else if (direction == 1 && currentRow < 19) currentRow++;
                        else if (direction == 2 && currentCol > 0) currentCol--;
                        else if (direction == 3 && currentRow > 0) currentRow--;
                    }
                    break;
                case 6:
                    displayFloor(floor);
                    break;
            }
        }
    }

    public static void displayFloor(int[][] floor) {
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 20; c++) {
                System.out.print(floor[r][c] == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
