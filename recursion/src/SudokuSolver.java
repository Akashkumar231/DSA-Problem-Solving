class Solution {

    char[][] result;

    public boolean isSafe(char[][] board, int row, int col, char ch) {

        // Check row
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == ch) {
                return false;
            }
        }

        // Check column
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == ch) {
                return false;
            }
        }

        // Check 3x3 subgrid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[startRow + r][startCol + c] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

    public void getPath(char[][] board, int row, int col) {

        if (row == 9) {
            result = new char[9][9];
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    result[r][c] = board[r][c];  // ✅ fixed
                }
            }
            return;
        }

        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col == 8) ? 0 : col + 1;

        if (board[row][col] != '.') {
            getPath(board, nextRow, nextCol);
            return;
        }

        for (char ch = '1'; ch <= '9'; ch++) {

            if (!isSafe(board, row, col, ch)) {
                continue;
            }

            board[row][col] = ch;

            getPath(board, nextRow, nextCol);

            if (result != null) return;  // stop after solution found

            board[row][col] = '.';  // backtrack
        }
    }

    public void solveSudoku(char[][] board) {

        getPath(board, 0, 0);

        // Copy result back into original board
        if (result != null) {
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    board[r][c] = result[r][c];
                }
            }
        }
    }
}
