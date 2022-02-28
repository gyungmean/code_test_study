import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        int[] new_nums = Arrays.stream(nums).distinct().toArray();
        return new_nums.length >= count ? count : new_nums.length;
    }
}
