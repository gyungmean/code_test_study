import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        Arrays.sort(arr);
        for(int i = str.length() - 1; i >= 0; i--){
            answer *= 10;
            answer += arr[i];
        }
        return answer;
    }
}
