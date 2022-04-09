import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        
        int str_idx = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            answer[i] = Integer.parseInt(str.substring(str_idx, str_idx + 1));
            str_idx++;
        }
        return answer;
    }
}
