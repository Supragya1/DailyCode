class Solution {
public:
    bool exist(vector<vector<char>>& board, string targetWord) {
        for (int row = 0; row < board.size(); row++) {
            for (int col = 0; col < board[0].size(); col++) {
                if (dfs(board, targetWord, 0, row, col)) {
                    return true;
                }
            }
        }
        return false;
    }

    bool dfs(vector<vector<char>>& board, string& targetWord, int index, int row, int col) {
        if (index == targetWord.length()) {
            return true;
        }

        if (row < 0 || row >= board.size() ||
            col < 0 || col >= board[0].size() ||
            board[row][col] != targetWord[index]) {
            return false;
        }

        char org_char = board[row][col];
        board[row][col] = '.';

        if (dfs(board, targetWord, index + 1, row + 1, col) ||
            dfs(board, targetWord, index + 1, row - 1, col) ||
            dfs(board, targetWord, index + 1, row, col + 1) ||
            dfs(board, targetWord, index + 1, row, col - 1)) {
            return true;
        }

        board[row][col] = org_char;
        return false;
    }
};
