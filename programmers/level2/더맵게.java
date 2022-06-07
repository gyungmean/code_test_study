import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        Arrays.sort(scoville);
        int answer = 0;
        int new_food = 0;
        for(int i = 0; i < scoville.length - 1; i++){
            if(scoville[i] >= K) break;
            new_food = Math.min(scoville[i], scoville[i + 1]) + Math.max(scoville[i], scoville[i + 1]) * 2;
            scoville[i + 1] = new_food;
            answer++;
        }
        if(scoville[scoville.length - 1] >= K) return answer;
        else return -1;
    }
}
