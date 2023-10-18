package main.medium;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        // if dead now, dead next gen --> 0
        // if dead now, live next gen --> 2
        // if live now, live next gen --> 1
        // if live now, dead next gen --> 3
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int liveNeighbors = 0;
                if (i != 0) {
                    liveNeighbors += board[i-1][j] % 2;
                    if (j != 0) {
                        liveNeighbors += board[i-1][j-1] % 2;
                    }
                    if (j < board[i].length-1) {
                        liveNeighbors += board[i-1][j+1] % 2;
                    }
                }
                if (i < board.length-1) {
                    liveNeighbors += board[i+1][j] % 2;
                    if (j != 0) {
                        liveNeighbors += board[i+1][j-1] % 2;
                    }
                    if (j < board[i].length-1) {
                        liveNeighbors += board[i+1][j+1] % 2;
                    }
                }
                if (j != 0) {
                    liveNeighbors += board[i][j-1] % 2;
                }
                if (j < board[i].length-1) {
                    liveNeighbors += board[i][j+1] % 2;
                }

                if (board[i][j] == 0) {
                    if (liveNeighbors == 3) {
                        board[i][j] = 2;
                    }
                } else {
                    if (liveNeighbors != 2 && liveNeighbors != 3) {
                        board[i][j] = 3;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }
}
