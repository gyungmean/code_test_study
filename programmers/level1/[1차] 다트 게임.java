class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int i = 0;
        double fore = 0;
        while(i < dartResult.length()){
            double score = 0;
            String bonus = "";
            String option = "";
            
            while(Character.isDigit(dartResult.charAt(i))){
                score = score * 10 + Character.getNumericValue(dartResult.charAt(i++));
            }

            bonus += dartResult.charAt(i++);
    
            if(i < dartResult.length() && (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')){
                option += dartResult.charAt(i++);
            }
            
            switch(bonus){
                case "D" :
                    score = Math.pow(score, 2);
                    break;
                case "T":
                    score = Math.pow(score, 3);
            }

            if(option != ""){
                switch(option){
                    case "*" :
                        fore *= 2;
                        score *= 2;
                        break;
                    case "#":
                        score = 0 - score;
                }
            }
            answer += fore;
            fore = score;
        }
        answer += fore;
        return answer;
    }
}
