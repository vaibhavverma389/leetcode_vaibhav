class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0, b = 0, c = 0;
        HashSet<Character> d = new HashSet<>();

        while (b < s.length()) {
            if (!d.contains(s.charAt(b))) {
                d.add(s.charAt(b));
                c = Math.max(c, b - a + 1);
                b++;
            } else {
                d.remove(s.charAt(a));
                a++;
            }
        }

        return c;
    }
}