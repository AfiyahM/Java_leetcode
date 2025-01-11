//https://leetcode.com/problems/construct-k-palindrome-strings/description/
class construct_k_palindrome_strings {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        int[] charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int oddCount = 0;
        for (int count : charCounts) {
            if (count % 2 != 0) oddCount++;
        }

        return oddCount <= k;
    }
}
