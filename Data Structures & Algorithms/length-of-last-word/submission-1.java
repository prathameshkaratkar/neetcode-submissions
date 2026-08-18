class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split("\\s+");
        int n = s1.length;

        String s2 = s1[n - 1];

        return s2.length();
    }
}