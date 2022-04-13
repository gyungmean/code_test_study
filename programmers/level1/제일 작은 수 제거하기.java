class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[arr.length - 1];
            int min = 0;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            System.out.println(min);
            int idx = 0;
            for(int i = 0; i < arr.length; i++){
                if(i == min){ continue; }
                answer[idx++] = arr[i];
                }
        }
        return answer;
    }
}
