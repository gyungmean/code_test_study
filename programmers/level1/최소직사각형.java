class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] w = {sizes[0][0], sizes[0][1]};
        for(int[] size : sizes){
            int wallet_max = w[0] >= w[1] ? 0 : 1;
            int size_max = size[0] >= size[1] ? 0 : 1;
            if(w[wallet_max] < size[size_max]){
                w[wallet_max] = size[size_max];
            }
            if(w[(wallet_max + 1) % 2] < size[(size_max + 1) % 2]){
                w[(wallet_max + 1) % 2] = size[(size_max + 1) % 2];
            }
            
        }
        answer = w[0] * w[1];
        return answer;
    }
}
