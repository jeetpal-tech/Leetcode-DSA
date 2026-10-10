class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int j = n-1;
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(j)))
                    j--;
                ans.append(s.charAt(j--));
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}

