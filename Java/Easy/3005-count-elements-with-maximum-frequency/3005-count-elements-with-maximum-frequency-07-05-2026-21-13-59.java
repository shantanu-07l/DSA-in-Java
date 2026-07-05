class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: build frequency map
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Step 2: find max frequency
        int maxFreq = 0;
        for (int freq : hm.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Step 3: count how many numbers have max frequency
        int count = 0;
        for (int freq : hm.values()) {
            if (freq == maxFreq) {
                count++;
            }
        }

        // Step 4: return total elements contributing
        return count * maxFreq;
    }
}