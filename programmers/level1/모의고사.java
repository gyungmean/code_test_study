import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = {0, 0, 0};
       
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == p1[i % 5]){ scores[0]++; }
            if(answers[i] == p2[i % 8]){ scores[1]++; }
            if(answers[i] == p3[i % 10]){ scores[2]++; }
        }
        
        int[] tmp = {scores[0], scores[1], scores[2]};
        Arrays.sort(tmp);
        List<Integer> answer_list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(scores[i] == tmp[2]){ answer_list.add(i + 1); }
        }
        
        int[] answer = new int[answer_list.size()];
        for(int i = 0; i < answer_list.size(); i++){
            answer[i] = answer_list.get(i);
        }
        return answer;
    }
}
