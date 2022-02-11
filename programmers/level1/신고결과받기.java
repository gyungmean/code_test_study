import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        report = Arrays.stream(report).distinct().toArray(String[]::new);
        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, ArrayList<String>> idMap = new HashMap<>();
        
        for(String s : report){
            String[] r = s.split(" ");
            if(count.containsKey(r[1])){
                count.put(r[1], count.get(r[1]) + 1);
            }
            else{
                count.put(r[1], 1);
            }
            ArrayList<String> tmp = new ArrayList<>();
            if(idMap.containsKey(r[1])){
                tmp = idMap.get(r[1]);
                tmp.add(r[0]);
                idMap.put(r[1], tmp);
            }
            else{
                tmp.add(r[0]);
                idMap.put(r[1], tmp);
            }
        }
        
        HashMap<String, Integer> mailMap = new HashMap<String, Integer>();
        
        for(Map.Entry<String, Integer> c : count.entrySet()){
            if(c.getValue() >= k){
                for(String s : idMap.get(c.getKey())){
                    if(mailMap.containsKey(s)){
                        mailMap.put(s, mailMap.get(s) + 1);
                    }
                    else{
                        mailMap.put(s, 1);
                    }
                }
            }
        }
        
        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){
            if(mailMap.containsKey(id_list[i])){
                answer[i] = mailMap.get(id_list[i]);
            }
            else{
                answer[i] = 0;
            }
        }
        return answer;
    }
}
