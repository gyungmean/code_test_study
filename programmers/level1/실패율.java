import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> fail = new HashMap<>();
        for(int i = 1; i <= N; i++){
            int stage_count = 0;
            int user_count = 0;
            for(int s : stages){
                if(s >= i) { user_count++; }
                if(s == i) { stage_count++;}
            }
            fail.put(i, (double)stage_count / user_count);
        }
        
        List<Map.Entry<Integer, Double>> fail_list = new LinkedList<>(fail.entrySet());
        fail_list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        
        int[] answer = new int[N];
        int idx = 0;
        for(Map.Entry<Integer, Double> f : fail_list){
            answer[idx++] = f.getKey();
        }
        return answer;
    }
}
