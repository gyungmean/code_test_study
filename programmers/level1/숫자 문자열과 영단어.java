import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = "";
        for(int i = 0; i < s.length(); i++){
            if(!(97 <= s.charAt(i))){
                answer = answer * 10 + Integer.valueOf(s.charAt(i)) - 48;
                continue;
            }
            tmp += s.charAt(i);
            switch(tmp){
                case "zero":
                    answer = answer * 10;
                    tmp = "";
                    break;
                case "one":
                    answer = answer * 10 + 1;
                    tmp = "";
                    break;
                case "two":
                    answer = answer * 10 + 2;
                    tmp = "";
                    break;
                case "three":
                    answer = answer * 10 + 3;
                    tmp = "";
                    break;
                case "four":
                    answer = answer * 10 + 4;
                    tmp = "";
                    break;
                case "five":
                    answer = answer * 10 + 5;
                    tmp = "";
                    break;
                case "six":
                    answer = answer * 10 + 6;
                    tmp = "";
                    break;
                case "seven":
                    answer = answer * 10 + 7;
                    tmp = "";
                    break;
                case "eight":
                    answer = answer * 10 + 8;
                    tmp = "";
                    break;
                case "nine":
                    answer = answer * 10 + 9;
                    tmp = "";
                    break;
            }
        }
        return answer;
    }
}
