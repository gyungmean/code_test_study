import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> table = new HashMap<String, Integer>();
        
        for(String p : participant){
            if(table.containsKey(p)){
               table.put(p, table.get(p) + 1);
            }
            else{
                table.put(p, 1);
            }
        }
        for(String c : completion){
            table.put(c, table.get(c) - 1);
        }
        for(String key : table.keySet()){
            if(table.get(key) != 0){
                answer += key;
                break;
            }
        }
        return answer;
    }
}
