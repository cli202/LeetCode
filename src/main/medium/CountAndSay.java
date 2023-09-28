package main.medium;

/*
38. Count and Say
8/13/2023
Difficulty: Medium (easy)
Topics: String
Understanding: Complete
Companies: Pinterest, Apple, Amazon
 */

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            String result = countAndSay(n - 1);
            char prev = result.charAt(0);
            int count = 0;
            StringBuilder resultNew = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
                char curr = result.charAt(i);
                if (prev == curr) {
                    count++;
                } else {
                    resultNew.append(count);
                    resultNew.append(prev);
                    prev = curr;
                    count = 1;
                }
            }
            resultNew.append(count);
            resultNew.append(prev);
            return resultNew.toString();
        }
    }
}
