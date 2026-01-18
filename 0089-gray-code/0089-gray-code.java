class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        int a = 1 << n;

        for (int i = 0; i < a; i++) {
            ans.add(i ^ (i >> 1));
        }

        return ans;
    }
}
