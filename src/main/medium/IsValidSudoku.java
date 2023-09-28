package main.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> col = new HashSet<>();
        Set<Character> row = new HashSet<>();
        Set<Character> cube = new HashSet<>();
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (uniq.contains(board[i][j])) {
//                    return false;
//                } else if (board[i][j] != '.'){
//                    uniq.add(board[i][j]);
//                }
//            }
//            uniq.clear();
//        }
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (uniq.contains(board[j][i])) {
//                    return false;
//                } else if (board[j][i] != '.'){
//                    uniq.add(board[j][i]);
//                }
//            }
//            uniq.clear();
//        }
//
//        System.out.println("here");
//        int row = 0;
//        int col = 0;
//        int newRow = 0;
//        int newCol = 0;
//        for (int square = 0; square < 9; square++) {
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    newRow = i + row;
//                    newCol = j + col;
//                    if (uniq.contains(board[newRow][newCol])) {
//                        return false;
//                    } else if (board[newRow][newCol] != '.') {
//                        uniq.add(board[newRow][newCol]);
//                    }
//                }
//            }
//            row = ((square + 1) / 3) * 3;
//            col = col == 6 ? 0 : col + 3;
//            uniq.clear();
//        }
        return true;
    }
}
