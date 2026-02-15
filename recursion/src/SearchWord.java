class Solution {
    int [] dr = {-1,+1,0,0};
    int [] dc = {0,0,-1,+1};


    public boolean search(char [][] board, String word , int index , int row ,int column){
        // positive base case
        if(index == word.length()){
            return true;
        }

        // negative case getting out of the board
        if(row<0 || column < 0 || row == board.length || column == board[0].length){
            return false;
        }

        // character mis macth
        if(board[row][column] != word.charAt(index)){
            return false;
        }

        // recursive call
        for (int d= 0 ; d < 4; d++){
            board[row][column]='#';
            boolean ans = search(board , word , index+1 ,row+dr[d],column+dc[d]);
            if(ans == true) return true;
            board[row][column]=word.charAt(index); // backtracking
        }

        return false;
    }


    public boolean exist(char[][] board, String word) {
        for(int r= 0 ; r< board.length ; r++){
            for(int c = 0 ; c< board[0].length ; c++){
                boolean ans = search(board,word,0,r,c);
                if(ans == true) return true;
            }
        }
        return false;
    }
}