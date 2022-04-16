class Solution {
    public boolean solution(int x) {
        String[] digit = Integer.toString(x).split("");
        int sum = 0;
        for(String d : digit){
            sum += Integer.parseInt(d);
        }
        boolean answer = x % sum == 0 ? true : false;
        return answer;
    }
}
