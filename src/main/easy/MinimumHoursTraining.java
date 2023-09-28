package main.easy;

/*
2383. Minimum Hours of Training to Win a Competition
8/14/2023
Difficulty: easy
Topics: Array, Greedy
Understanding: Complete
Companies: None
 */

public class MinimumHoursTraining {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energies, int[] experience) {
        int totalEnergy = 0;
        for (int energy: energies) {
            totalEnergy += energy;
        }
        int addExp = 0;
        for (int exp: experience) {
            if (exp >= initialExperience) {
                addExp = Math.max(addExp, exp - initialExperience + 1);
            }
            initialExperience += exp;
        }
        int energyNeeded = Math.max(totalEnergy - initialEnergy + 1, 0);
        int experienceNeeded = addExp;
        return energyNeeded + experienceNeeded;
    }
}
