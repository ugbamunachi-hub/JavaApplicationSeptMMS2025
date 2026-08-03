/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

public class TicTacToe {
 public enum CellValue {
    X, O, EMPTY
}

    private final CellValue[][] board;
    private boolean xTurn;

    public TicTacToe() {
        board = new CellValue[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = CellValue.EMPTY;
            }
        }
        xTurn = true;
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != CellValue.EMPTY) {
            return false;
        }
        board[row][col] = xTurn ? CellValue.X : CellValue.O;
        xTurn = !xTurn;
        return true;
    }

    public boolean isXTurn() {
        return xTurn;
    }

    public void printBoard() {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                char symbol = '-';
                if (board[i][j] == CellValue.X) symbol = 'X';
                if (board[i][j] == CellValue.O) symbol = 'O';
                System.out.print(symbol + (j < 2 ? "|" : ""));
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
        System.out.println();
    }

    public CellValue checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != CellValue.EMPTY && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0];
            }
            if (board[0][i] != CellValue.EMPTY && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i];
            }
        }
        if (board[0][0] != CellValue.EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != CellValue.EMPTY && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2];
        }
        return CellValue.EMPTY;
    }

    public boolean isDraw() {
        if (checkWinner() != CellValue.EMPTY) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == CellValue.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}