package test.medium;

/**
 * Problem:
 * Date:
 * Difficulty:
 * Understanding:
 * Topics:
 * Companies
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int cur = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= cur) {
                cur = i;
            }
        }
        return cur == 0;
    }
}
