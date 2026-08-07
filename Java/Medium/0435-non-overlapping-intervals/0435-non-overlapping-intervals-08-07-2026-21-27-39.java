class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int lastFinish = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < lastFinish) {
                // Overlapping → remove this interval
                count++;
            } else {
                // Non-overlapping → keep it
                lastFinish = intervals[i][1];
            }
        }

        return count;
    }
}