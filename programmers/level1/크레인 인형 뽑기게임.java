import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<Integer>();
        
        for(int m : moves){
            int i = 0;
            while(i < board.length - 1){//수정해야하는 부분
                if(board[i][m] != 0) break;
                if(board[i][m] == 0){
                i++;
                }
            }
            if(i >= board.length) continue;
            if(bucket.empty() != true){
                if(bucket.peek() != board[i][m]){
                    bucket.push(board[i][m]);
                }
                else{
                    answer++;
                    bucket.pop();
                }
        }
            else{
                bucket.push(board[i][m]);
            }
        
    }
        return answer;
}
}
