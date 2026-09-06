class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder S = new StringBuilder(s);
        int n = s.length();
        int i = 0;
        int j = n-1;

        while( i < j){
            if(!Character.isLetterOrDigit(S.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(S.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(S.charAt(i)) != Character.toLowerCase(S.charAt(j))){
                return false;
            }
            i++;
            j--;

        }
        return true;




        // for(int i=0; i<sb.length()/2; i++){
        //     int front=i;
        //     int back=sb.length()-1-i;

        //     char frontchar=sb.charAt(front);
        //     char backchar=sb.charAt(back);

        //     sb.setCharAt(front , backchar);
        //     sb.setCharAt(back , frontchar);
        // }


        

        
    }
}