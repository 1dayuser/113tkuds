import java.util.Scanner;

public class TicTacToe5x5 {
    private static final int SIZE = 5;
    private static final char EMPTY = '.';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    static char[][] initializeBoard() {
        char[][] board = new char[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = EMPTY;
            }
        }
        return board;
    }

    static void printBoard(char[][] board) {
        System.out.println("\n  井字遊戲棋盤");
        System.out.print("  ");
        for (int col = 0; col < SIZE; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        
        for (int row = 0; row < SIZE; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    static boolean placePiece(char[][] board, int row, int col, char player) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            System.out.printf("無效座標：(%d, %d)\n", row, col);
            return false;
        }

        if (board[row][col] != EMPTY) {
            System.out.printf("位置 (%d, %d) 已被佔用\n", row, col);
            return false;
        }

        board[row][col] = player;
        return true;
    }

    static char checkWinner(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                char player = board[row][col];
                if (player == EMPTY) continue;

                if (col + 4 < SIZE &&
                    player == board[row][col+1] &&
                    player == board[row][col+2] &&
                    player == board[row][col+3] &&
                    player == board[row][col+4]) return player;

                if (row + 4 < SIZE &&
                    player == board[row+1][col] &&
                    player == board[row+2][col] &&
                    player == board[row+3][col] &&
                    player == board[row+4][col]) return player;

                if (row + 4 < SIZE && col + 4 < SIZE &&
                    player == board[row+1][col+1] &&
                    player == board[row+2][col+2] &&
                    player == board[row+3][col+3] &&
                    player == board[row+4][col+4]) return player;

                if (row + 4 < SIZE && col - 4 >= 0 &&
                    player == board[row+1][col-1] &&
                    player == board[row+2][col-2] &&
                    player == board[row+3][col-3] &&
                    player == board[row+4][col-4]) return player;
            }
        }
        return EMPTY;
    }

    static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = initializeBoard();
        char currentPlayer = PLAYER_X;

        System.out.println("=== 井字遊戲 (5x5) ===");
        printBoard(board);

        while (true) {
            System.out.printf("\n玩家 %c 請輸入座標 (row col): ", currentPlayer);

            int row, col;
            try {
                row = scanner.nextInt();
                col = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("請輸入有效的整數！");
                scanner.nextLine(); 
                continue;
            }

            if (placePiece(board, row, col, currentPlayer)) {
                printBoard(board);
                char winner = checkWinner(board);
                if (winner != EMPTY) {
                    System.out.printf("\n玩家 %c 獲勝！\n", winner);
                    break;
                } else if (isBoardFull(board)) {
                    System.out.println("\n平手！");
                    break;
                }
                currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
            }
        }

        scanner.close();
    }
}
