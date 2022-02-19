import java.util.Arrays;
class Solution {
    int answer = 0;
    public int solution(int[] nums) {
        int[] bucket = {0, 0, 0};
        
        select(nums, bucket, 0, 0);

        return answer;
    }
    
    public void select(int[] nums, int[] bucket, int now, int k){
        if(k > 3) {return;}
        if(k == 3){
            int sum = 0;
            for(int i = 0; i < 3; i++){
                sum += bucket[i];
            }
            if(check(sum)){
                System.out.println(Arrays.toString(bucket) + "를 이용해서 " + sum + "을 만들 수 있습니다.");
                answer++;
            }
            return;
        }
        for(int i = now; i < nums.length; i++){
            bucket[k] = nums[i];
            select(nums, bucket, i + 1, k + 1);
        }
    }
    
    public boolean check(int sum){
        for(int i = 2; i < sum; i++){
            if(sum % i == 0){
                return false;
            }
        }
        return true;
    }
}
