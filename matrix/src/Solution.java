class Solution {

    // Check if a row is valid
    public boolean isRowValid(char[][] board, int row) {
        int[] freq = new int[10];

        for (int col = 0; col < 9; col++) {
            if (board[row][col] == '.')
                continue;

            int value = board[row][col] - '0';
            freq[value]++;
            if (freq[value] > 1)
                return false;
        }
        return true;
    }

    // Check if a column is valid
    public boolean isColValid(char[][] board, int col) {
        int[] freq = new int[10];

        for (int row = 0; row < 9; row++) {
            if (board[row][col] == '.')
                continue;

            int value = board[row][col] - '0';
            freq[value]++;
            if (freq[value] > 1)
                return false;
        }
        return true;
    }

    // Check if a 3x3 subgrid is valid
    public boolean isSubgridValid(char[][] board, int row, int col) {
        int[] freq = new int[10];

        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                if (board[r][c] == '.')
                    continue;

                int value = board[r][c] - '0';
                freq[value]++;
                if (freq[value] > 1)
                    return false;
            }
        }
        return true;
    }

    // Main validation method
    public boolean isValidSudoku(char[][] board) {

        // Check all rows
        for (int row = 0; row < 9; row++) {
            if (!isRowValid(board, row))
                return false;
        }

        // Check all columns
        for (int col = 0; col < 9; col++) {
            if (!isColValid(board, col))
                return false;
        }

        // Check all 3x3 subgrids
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!isSubgridValid(board, row, col))
                    return false;
            }
        }

        return true;
    }
}
