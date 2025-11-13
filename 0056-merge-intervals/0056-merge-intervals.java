class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) 
            return new int[0][];
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        java.util.List<int[]> result = new java.util.ArrayList<>();
        int[] current = intervals[0];
        result.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);  
            } else {
                current = next;   
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
