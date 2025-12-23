public class TIcTacToe_Game {

    public static boolean isWinner(char [][] board , int row , int col , char ch){

        if (board[0][col] == ch && board[1][col]== ch && board[2][col]==ch){
            return true;
        }

        if (board[row][0] == ch && board[row][1]== ch && board[row][2]==ch){
            return true;
        }

        if (board[0][0] == ch && board[1][1]== ch && board[2][2]==ch){
            return true;
        }

        if (board[0][2] == ch && board[1][1]== ch && board[2][0]==ch){
            return true;
        }

        return false;

    }

    public static void main(String [] args){

    }

}
