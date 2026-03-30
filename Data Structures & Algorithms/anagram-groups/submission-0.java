class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // use a hashTable of size 26, 
        // each store a character frequency
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String cur = strs[i];
            int[] freq = new int[26];
            for (int j = 0; j < cur.length(); j++) {
                char curChar = cur.charAt(j);
                freq[curChar - 'a'] += 1;
            }
            String sequence = Arrays.toString(freq);
            if (!map.containsKey(sequence)) {
                map.put(sequence, new ArrayList<>());
            } 
            map.get(sequence).add(cur);
        }

        return new ArrayList<>(map.values());
    }
}
