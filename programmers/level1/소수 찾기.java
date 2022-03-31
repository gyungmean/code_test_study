class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime_checks = new boolean[n + 1]; //true : 소수 아님 false : 소수
        prime_checks[0] = true;
        prime_checks[1] = true;

        for(int i = 2; i * i <= n; i++){
            if(!prime_checks[i]){
                for(int j = i * i; j <= n; j += i){ 
                    prime_checks[j] = true;
                }
            }
        }
        for(boolean prime_check : prime_checks){
            if(!prime_check) {answer++;}
        }
        return answer;
    }
}
