package test.medium;

import org.junit.Test;
import main.medium.GameOfLife;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class GameOfLifeTest {
    @Test
    public void test1() {
        int[][] board = new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.gameOfLife(board);
        System.out.println(board);
    }
}