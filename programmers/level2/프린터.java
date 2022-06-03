import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        HashMap<Integer, Integer> print_list = new LinkedHashMap<>();
        for(int i = 0; i < priorities.length; i++){
            print_list.put(i, priorities[i]);
        }
        System.out.println(print_list);
        
        return answer;
    }
}
