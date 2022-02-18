import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<Integer>();
        
        for(int m : moves){
            int i = 0;
            while(i < board.length){
                if(board[i][m - 1] != 0) {
                    break;
                }
                if(board[i][m - 1] == 0){
                    i++;
                }
            }
            if(i >= board.length) continue;
            if(bucket.empty() != true){
                if(bucket.peek() != board[i][m - 1]){
                    bucket.push(board[i][m - 1]);
                }
                else{
                    answer++;
                    bucket.pop();
                }
            }
            else{
                bucket.push(board[i][m - 1]);
            }
            board[i][m - 1] = 0;
        }
        return answer * 2;
    }
}
