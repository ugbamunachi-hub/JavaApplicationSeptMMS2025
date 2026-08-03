/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

import java.util.Scanner;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);

        while (true) {
            game.printBoard();
            System.out.printf("Player %s's turn.%n", game.isXTurn() ? "X" : "O");
            System.out.print("Enter row (0-2) and column (0-2) separated by space: ");
            int row = input.nextInt();
            int col = input.nextInt();

            if (!game.makeMove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            CellValue winner = game.checkWinner();
            if (winner != CellValue.EMPTY) {
                game.printBoard();
                System.out.printf("Player %s wins!%n", winner);
                break;
            }

            if (game.isDraw()) {
                game.printBoard();
                System.out.println("The game is a draw!");
                break;
            }
        }
        input.close();
    }

    
}
