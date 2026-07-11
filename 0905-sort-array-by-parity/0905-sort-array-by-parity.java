class Solution {
    public int[] sortArrayByParity(int[] nums) {
           int n = nums.length;
           int[] arr = new int[n];
           int a = 0;
           int b = n-1;
           int idx = 0;

           while(idx<n){
            if(nums[idx] % 2 == 0){
                arr[a] = nums[idx];
                a++;
            }else{
                arr[b] = nums[idx];
                b--;
            }
            idx++;
           }
           return arr;

    }
}