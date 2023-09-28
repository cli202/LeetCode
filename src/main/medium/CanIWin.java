package main.medium;

import java.util.HashMap;
import java.util.Map;

public class CanIWin {
    Map<Integer, Boolean> map;
    boolean[] used;
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        used = new boolean[maxChoosableInteger + 1];
        map = new HashMap<>();
        return helper(desiredTotal);
    }

    public boolean helper(int desiredTotal) {
        if (desiredTotal <= 0) {
            return false;
        } else {
            if (map.containsKey(format())) {
                return map.get(format());
            }
            for (int i = 1; i < used.length; i++) {
                if (used[i] == false) {
                    used[i] = true;
                    if (!helper(desiredTotal - i)) {
                        map.put(format(), true);
                        used[i] = false;
                        return true;
                    }
                    used[i] = false;
                }
            }
            map.put(format(), false);
        }
        return map.get(format());
    }

    public int format() {
        int result = 0;
        for (int i = 0; i < used.length; i++) {
            int add = used[i] == true ? 1 : 0;
            result = result * 10 + add;
        }
        return result;
    }
}
