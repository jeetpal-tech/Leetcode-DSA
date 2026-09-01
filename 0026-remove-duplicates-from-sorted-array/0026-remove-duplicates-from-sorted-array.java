import java.util.Set;
import java.util.TreeSet; 

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new TreeSet<>(); 
        for (int i=0; i<n; i++){
            st.add(nums[i]);
        }

        int index=0;
        for(int it : st){
            nums[index] = it ;
            index++;
        } return index;

    }
}