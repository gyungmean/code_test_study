class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
        //3단계
        for(int i = 0; i < new_id.length(); i++){
            if(new_id.charAt(i) == '.'){
                while(i < new_id.length() - 1 && new_id.charAt(i+1) == '.'){
                    new_id = new_id.substring(0, i) + new_id.substring(i + 1);
                }
            }
        }
        //4단계
        if(new_id.charAt(0) == '.'){
            new_id = new_id.substring(1);
        }
        if(new_id.length() > 0&& new_id.charAt(new_id.length() - 1) == '.'){
                new_id = new_id.substring(0, new_id.length() - 1);
        }
        //5단계
        if(new_id.length() == 0){
            new_id = "a";
        }
        //6단계
        if(new_id.length() > 15){
            new_id = new_id.substring(0, 15);
            if(new_id.charAt(new_id.length() - 1) == '.'){
                new_id = new_id.substring(0, new_id.length() - 1);
            }     
        }
        //7단계
        while(new_id.length() <= 2 ){
            new_id = new_id + new_id.substring(new_id.length() - 1);
        }

        answer = new_id;
                  
        return answer;
    }
}
