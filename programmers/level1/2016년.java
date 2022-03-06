class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int day_count = 0;
        for(int i = 1; i < a; i++){
            if(i == 2) {day_count += 29;
                       }
            else if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                day_count += 31;
            }
            else{
                day_count += 30;
            }
        }
        day_count += b;
        answer = week[(day_count % 7 + 5 - 1) % 7];
        return answer;
    }
}
