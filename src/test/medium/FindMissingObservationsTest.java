package test.medium;

import org.junit.Test;
import main.medium.FindMissingObservations;
/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class FindMissingObservationsTest {
    @Test
    public void test1() {
        int[] rolls = new int[] {3,2,4,3};
        FindMissingObservations findMissingObservations = new FindMissingObservations();
        int[] result = findMissingObservations.missingRolls(rolls, 4, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    @Test
    public void test2() {
        int[] rolls = new int[] {4,5,6,2,3,6,5,4,6,4,5,1,6,3,1,4,5,5,3,2,3,5,3,2,1,5,4,3,5,1,5};
        FindMissingObservations findMissingObservations = new FindMissingObservations();
        int[] result = findMissingObservations.missingRolls(rolls, 4, 40);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}