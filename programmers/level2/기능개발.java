import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer_list = new ArrayList<>();
        int idx = 0;
        while(idx < progresses.length){
            int count = 1;
            int remain = 100 - progresses[idx];
            double day = Math.ceil(remain / speeds[idx++]);
            while(idx < progresses.length && 100 - progresses[idx] <= speeds[idx] * day){
                count++;
                idx++;
            }
            answer_list.add(count);
        }
        return answer_list.stream().mapToInt(i->i).toArray();
    }
}
