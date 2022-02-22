import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(String c : completion){
            int idx = Arrays.asList(participant).indexOf(c);
            if(idx < 0){ continue; }
            participant[idx] = "";
        }
        for(String s : participant){
            if(s.equals("") == false){
                answer += s;
                break;
            }
        }
        return answer;
    }
}
