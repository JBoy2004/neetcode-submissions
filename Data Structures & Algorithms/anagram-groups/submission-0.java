class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String curStr : strs) {
            int[] count = new int[26];

            for (char c : curStr.toCharArray()) {
                count[c - 'a'] ++;
            }

            String key = Arrays.toString(count);

            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(curStr);
        }
        return new ArrayList<>(result.values());
    }
}
