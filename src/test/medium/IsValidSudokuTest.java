package test.medium;

import org.junit.Test;
import main.medium.IsValidSudoku;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class IsValidSudokuTest {
    @Test
    public void test1() {
        IsValidSudoku isValidSudoku = new IsValidSudoku();
        char[][] board = new char[][] {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku.isValidSudoku(board));
    }
    
    @Test
    public void test2() {
        IsValidSudoku isValidSudoku = new IsValidSudoku();
        char[][] board = new char[][] {{'.','.','1','.','.','.','3','.','.'},{'.','.','4','.','.','.','1','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','8','.','.','.','.'},{'.','1','.','.','2','.','.','.','.'},{'.','.','.','.','.','.','6','3','.'},{'7','.','.','.','.','.','.','.','.'},{'5','8','.','.','.','.','4','.','.'},{'.','5','.','.','4','.','.','.','8'}};
        System.out.println(isValidSudoku.isValidSudoku(board));
    }
}