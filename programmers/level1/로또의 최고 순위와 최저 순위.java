import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int zero_count = 0;
        List<Integer> correct = new ArrayList<>();
        
        for(int l : lottos){
            if(l == 0){
                zero_count++;
                continue;
            }
            for(int w : win_nums){
                if(w == l){
                    correct.add(l);
                }
            }
        }
        
        int min = 6;
        int max = 6;
        
        switch(correct.size()){
            case 2:
                min = 5;
                break;
            case 3:
                min = 4;
                break;
            case 4:
                min = 3;
                break;
            case 5:
                min = 2;
                break;
            case 6:
                min = 1;
                break;
        }
        
        switch(correct.size() + zero_count){

            case 6:
                max = 1;
                break;
            case 5:
                max = 2;
                break;
            case 4:
                max = 3;
                break;
            case 3:
                max = 4;
                break;
            case 2:
                max = 5;
                break;
        }
        
        int[] answer = {max, min};
        
        return answer;
    }
}
