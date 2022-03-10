import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer_list = new ArrayList<Integer>();
        int fore = -1;
        for(int num : arr){
            if(fore != num){
                answer_list.add(num);
            }
            fore = num;
        }
        int[] answer = new int[answer_list.size()];
        for(int i = 0; i < answer_list.size(); i++){
            answer[i] = answer_list.get(i);
        }
        return answer;
    }
}
