class Solution {
    public String reverseWords(String s) {
        char[] s_arr = s.toCharArray();
        int start = 0;
        for (int i = 0; i <= s_arr.length; i++) {
            if (i == s_arr.length || s_arr[i] == ' ') {
                reverse(s_arr, start, i - 1);
                start = i + 1;
            }
        } return new String(s_arr);
    }

    private void reverse(char[] s_arr, int left, int right) {
        while (left < right) {
            char temp = s_arr[left];
            s_arr[left] = s_arr[right];
            s_arr[right] = temp;
            left++;
            right--;
        }
    }
}