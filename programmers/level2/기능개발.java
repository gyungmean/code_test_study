import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer_list = new ArrayList<>();
        int idx = 0;
        while(idx < progresses.length){
            int count = 1;
            int day = (100 - progresses[idx]) / speeds[idx];
            if((100 - progresses[idx]) % speeds[idx++] != 0) {
                day++;
            }
            
            while(idx < progresses.length && 100 - progresses[idx] <= speeds[idx] * day){
                count++;
                idx++;
            }
            answer_list.add(count);
        }
        return answer_list.stream().mapToInt(i->i).toArray();
    }
}
