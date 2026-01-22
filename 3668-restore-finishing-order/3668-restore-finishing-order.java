class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }
        List<Integer> result = new ArrayList<>();
        for (int runner : order) {
            if (friendSet.contains(runner)) {
                result.add(runner);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
