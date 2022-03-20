import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<Character> arr_list = new ArrayList<>();
        for(String s : strings){
            arr_list.add(s.charAt(n));
        }
        
        Set<Character> set = new HashSet<Character>(arr_list);
        arr_list =new ArrayList<Character>(set);

        Collections.sort(arr_list);
        List<String> answer_list = new ArrayList<>();
        for(char c : arr_list){
            for(String s : strings){
                if(s.charAt(n) == c){
                    answer_list.add(s);
                }
            }
        }
                    
        String[] answer = answer_list.toArray(String[]::new);
        return answer;
    }
}
