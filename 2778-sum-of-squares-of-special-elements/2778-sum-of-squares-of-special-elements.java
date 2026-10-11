class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=1; i <= n ; i++){
            if(n % i == 0){
                ans += (nums[i-1] * nums[i-1]);
            } 
        }return ans; 
    } 
}

//nums[i] will  not be used coz i is considered from 1 like indxing in real life , but indexing in java is from zero . 
//so dont be confused , the question is from to get us confused!