import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> result = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                result.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[result.size()];
        int idx = 0;
        for(Integer val : result){
            answer[idx++] = val;
        }
        Arrays.sort(answer);
        return answer;
    }
}
