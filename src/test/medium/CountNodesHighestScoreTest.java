package test.medium;

import org.junit.Test;
import main.medium.CountNodesHighestScore;
import main.medium.CountNodes;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class CountNodesHighestScoreTest {
    @Test
    public void test1() {
        int[] parents = new int[] {-1,2,0,2,0};
        CountNodesHighestScore countNodesHighestScore = new CountNodesHighestScore();
        System.out.println(countNodesHighestScore.countHighestScoreNodes(parents));

    }
}