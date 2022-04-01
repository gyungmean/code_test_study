class Solution {
    public String solution(int n) {
        String answer = "수";
        answer = answer.repeat(n);
        answer = answer.replaceAll("수수", "수박");
        return answer;
    }
}
