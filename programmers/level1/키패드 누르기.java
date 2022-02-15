class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int now_left = 10, now_right = 12;
        for(int n : numbers){
            if(n == 0) {n = 11;}
            if(n == 1 || n == 4 || n == 7){
                answer += "L";
                now_left = n;
            }
            else if(n == 3 || n == 6 || n == 9){
                answer += "R";
                now_right = n;
            }
            else{
                int left_d, right_d;
                if(now_left == 1 || now_left == 4 || now_left == 7 || now_left == 10){
                    if(Math.abs(now_left - n) == 1){
                        left_d = 1;
                    }
                    else{
                        left_d = Math.abs((now_left + 1) - n) / 3 + 1;
                    }
                }
                else{
                    left_d = Math.abs(now_left - n) / 3;
                }
                if(now_right == 3 || now_right == 6 || now_right == 9 || now_right == 12){
                    if(Math.abs(now_right - n) == 1){
                        right_d = 1;
                    }
                    else{
                        right_d = Math.abs((now_right - 1) - n) / 3 + 1;
                    }
                }
                else{
                    right_d = Math.abs(now_right - n) / 3;
                }
                if(left_d == right_d){
                    if(hand.equals("left")){
                        answer += "L";
                        now_left = n;
                    }
                    else{
                        answer += "R";
                        now_right = n;
                    }
                }
                else{
                    if(left_d < right_d){
                        answer += "L";
                        now_left = n;
                    }
                    else{
                         answer += "R";
                        now_right = n;
                    }
                }
            }
        }
        return answer;
    }
}
