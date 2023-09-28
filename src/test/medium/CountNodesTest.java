package test.medium;

import org.junit.Test;
import main.medium.CountNodes;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class CountNodesTest {
    @Test
    public void test1() {
        int[] parents = new int[] {-1,2,0,2,0};
        CountNodes countNodes = new CountNodes();
        System.out.println(countNodes.countHighestScoreNodes(parents));
    }
}