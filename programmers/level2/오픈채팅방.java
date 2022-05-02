import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> answer_list = new ArrayList<>();
        HashMap<String, String> user = new HashMap<>();
        
        for(String r : record){
            String[] tmp = r.split(" ");
            switch(tmp[0]){
                    case "Enter":
                    user.put(tmp[1], tmp[2]);
                    break;
                    case "Change":
                    user.put(tmp[1], tmp[2]);
                    break;
            }
        }
        for(String r : record){
            String[] tmp = r.split(" ");

            switch(tmp[0]){
                    case "Enter":
                    answer_list.add(user.get(tmp[1]) + "님이 들어왔습니다.");
                    break;
                    case "Leave":
                    answer_list.add(user.get(tmp[1]) + "님이 나갔습니다.");
                    break;
        }
    }
        String[] answer = answer_list.toArray(String[] :: new);
        return answer;
    }
}
