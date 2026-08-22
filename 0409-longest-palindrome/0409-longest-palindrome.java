class Solution {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Calculate maximum palindrome length
        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        // Add one odd character in the center
        if (hasOdd) {
            length++;
        }

        return length;
    }
}