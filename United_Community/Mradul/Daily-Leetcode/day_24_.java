// https://leetcode.com/problems/word-search/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions


class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (cheak(board, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean cheak(char[][] board, String word, int index, int i, int j) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || // dealing with out of bound
            j < 0 || j >= board[0].length ||
            board[i][j] != word.charAt(index)) { // mismatch
            return false;
        }

        char og = board[i][j];
        board[i][j] = '.';

        if (cheak(board, word, index + 1, i + 1, j) || // moving rigth
            cheak(board, word, index + 1, i - 1, j) || // moving left
            cheak(board, word, index + 1, i, j + 1) || // moving down
            cheak(board, word, index + 1, i, j - 1)) { // moving up
            return true;
        }

        board[i][j] = og;
        return false;
    }
}