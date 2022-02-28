import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        Arrays.sort(nums);
        int[] new_nums = Arrays.stream(nums).distinct().toArray();
        int answer = count;
        if(new_nums.length >= count){
            return answer;
        }
        else{
            return new_nums.length;
        }
    }
}
