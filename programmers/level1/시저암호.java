class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i + 1).equals(" ")){
                answer += " ";
                continue; 
            }
            int cipher = s.charAt(i);
            if(Character.isUpperCase(cipher)){
                cipher += n;
                if(cipher > 'Z'){
             cipher -= 26;     
                }
            }
            else if(Character.isLowerCase(cipher)){
                cipher += n;
                if(cipher > 'z'){
             cipher -= 26;     
                }
            }
            answer += (char)cipher;
        }
        return answer;
    }
}
