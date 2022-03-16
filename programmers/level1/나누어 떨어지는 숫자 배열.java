import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        List<Integer> answer_list = new ArrayList<Integer>();
        for(int num : arr){
            if(num % divisor == 0){
                answer_list.add(num);
            }
        }
        if(answer_list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[answer_list.size()];
            for(int i = 0; i < answer_list.size(); i++){
                answer[i] = answer_list.get(i);
            }
        }
        return answer;
    }
}
