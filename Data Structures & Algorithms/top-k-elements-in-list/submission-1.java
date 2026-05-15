class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        //populate freq hashmap
        for (int n : nums) {
            int curCount = freqMap.getOrDefault(n, 0); //get 0 if first time seeing it (incr. to 1)
            freqMap.put(n, curCount + 1);
        }

        // Lambda: "Compare these two numbers (a and b) by looking up their counts in freqMap"
        // b - a makes it a Max Heap (highest frequency at the top)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(b) - freqMap.get(a)
        );

        //add all unique keys to heap
        for (int n : freqMap.keySet()) {
            maxHeap.offer(n);
        }

        int[] result = new int[k];
        //pop the top k results
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}