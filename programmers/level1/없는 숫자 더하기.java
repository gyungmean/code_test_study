import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] all_numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int n : numbers){
            all_numbers[n] = 0;
        }
        for(int n : all_numbers){
            answer += n;
        }
        return answer;
    }
}
