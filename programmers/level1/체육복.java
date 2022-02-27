import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int[] tmp = new int[n + 1];
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int r : reserve){
            tmp[r] = 2;
        }  
        for(int l : lost){
            tmp[l]--;
        }

        for(int l : lost){
            if(tmp[l] > 0) {
                answer++;
                continue;
            }
            if(tmp[l - 1] == 2){
                answer += 1;
                tmp[l - 1] = 1;
            }

            else{
                if(l + 1 <= n){
                if(tmp[l + 1] == 2){
                    answer += 1;
                    tmp[l + 1] = 1;
                }
                }
            }

        }
        return answer;
    }
}
