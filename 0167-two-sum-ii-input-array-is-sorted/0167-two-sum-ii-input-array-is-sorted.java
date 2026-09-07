class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0;
        int j=n-1;
        //int sum=numbers[i] + numbers[j];
        while(i<n){
            int sum=numbers[i] + numbers[j];
            if(sum == target){
                return new int[]{ i+1,j+1 };
            } else if (sum < target){
                i++;
            } else {
                j--;
            }
        }
        return null;
        //return new int[]{0,0}; 
        //return new int[]{-1,-1};
    }
    
}