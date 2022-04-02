class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i + 1).equals(" ")){
                answer += " ";
                continue; 
            }
            int cipher = s.charAt(i) + n;
            if(cipher > 'z' || (cipher < 'a' && cipher > 'Z')){
                cipher -= 26;
            }
            answer += (char)cipher;
        }
        return answer;
    }
}
