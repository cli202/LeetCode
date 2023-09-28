package test.easy;

import org.junit.Test;
import main.easy.MinimumHoursTraining;

public class MinimumHoursTrainingTest {
    @Test
    public void test1() {
        int[] energies = new int[] {1,4,3,2};
        int[] experience = new int[] {2,6,3,1};
        MinimumHoursTraining minimumHoursTraining = new MinimumHoursTraining();

        System.out.println(minimumHoursTraining.minNumberOfHours(5, 3, energies, experience));
    }

    @Test
    public void test2() {
        int[] energies = new int[] {1,4};
        int[] experience = new int[] {2,5};
        MinimumHoursTraining minimumHoursTraining = new MinimumHoursTraining();

        System.out.println(minimumHoursTraining.minNumberOfHours(5, 3, energies, experience));
    }

    @Test
    public void test3() {
        int[] energies = new int[] {69,22,93,68,57,76,54,72,8,78,88,15,58,61,25,70,58,91,79,22,91,74,90,75,31,53,31,7,51,96,76,17,64,89,83,54,28,33,32,45,20};
        int[] experience = new int[] {51,81,46,80,56,7,46,74,64,20,84,66,13,91,49,30,75,43,74,88,82,51,72,4,80,30,10,19,40,27,21,71,24,94,79,13,40,28,63,85,70};
        MinimumHoursTraining minimumHoursTraining = new MinimumHoursTraining();

        System.out.println(minimumHoursTraining.minNumberOfHours(11, 23, energies, experience));
    }
}