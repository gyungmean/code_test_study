import java.util.*;
class Solution {
    public String solution(String s) {
        List<Character> s_list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            s_list.add(s.charAt(i));
        }
        Collections.sort(s_list);
        Collections.reverse(s_list);
        String answer = "";
        for(char c : s_list){
            answer += c;
        }
        return answer;
    }
}
