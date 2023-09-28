package main.medium;

/*
1138. Alphabet Board Path
8/18/2023
Difficulty: Medium
Understanding: Complete
Topics: HashTable, String
Companies: Google, Amazon
 */

public class AlphabetBoardPath {
    public String alphabetBoardPath(String target) {
        StringBuilder result = new StringBuilder();
        int prevRow = 0;
        int prevCol = 0;
        char move;
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            int index = c - 97;
            int row = index / 5;
            int col = index % 5;
            if (row == prevRow && col == prevCol) {
                result.append('!');
            } else {
                if (row < prevRow) {
                    move = 'U';
                } else {
                    move = 'D';
                }
                if (row == 5) {
                    helper(result, move, prevRow, 4);
                } else {
                    helper(result, move, Math.min(row, prevRow), Math.max(row, prevRow));
                }
                if (col < prevCol) {
                    move = 'L';
                } else {
                    move = 'R';
                }
                helper(result, move, Math.min(col, prevCol), Math.max(col, prevCol));
                if (row == 5) {
                    result.append('D');
                }
                result.append('!');
                prevCol = col;
                prevRow = row;
            }
        }
        return result.toString();
    }

    public void helper(StringBuilder result, char move, int min, int max) {
        for (int i = min; i < max; i++) {
            result.append(move);
        }
    }
}
