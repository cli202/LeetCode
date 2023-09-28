package main.easy;

import java.util.ArrayList;
import java.util.List;

public class DecryptStringFromAlphabet {
    public String freqAlphabets(String s) {
        int count = 0;
        boolean twoDigit = false;
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                twoDigit = true;
            } else if (twoDigit && count > 9) {
                result.insert(0, (char)(count + 96));
                count = Integer.parseInt(String.valueOf(c));
                twoDigit = false;
            } else if (twoDigit == false) {
                result.insert(0, (char) (count + 96));
                count = Integer.parseInt(String.valueOf(c));
            } else {
                if (count == 0) {
                    count = Integer.parseInt(String.valueOf(c));
                } else {
                    count = count + Integer.parseInt(String.valueOf(c)) * 10;
                }
            }
        }
        result.insert(0, (char) (count + 96));
        return result.toString();
    }
}
