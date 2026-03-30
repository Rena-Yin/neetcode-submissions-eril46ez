class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // use a HashMap to store the frequency of each number
        // use an array of size = nums, make the frequency
        // as each index, the number as list of value appear each freq
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (!map.containsKey(cur)) {
                map.put(cur, 0);
            }
            map.put(cur, map.get(cur) + 1);
        }

        for (int key: map.keySet()) {
            int value = map.get(key);
            freq[value].add(key);
        }

        int[] res = new int[k];
        int index = 0;
        for (int j = freq.length - 1; j > 0 && k > index; j--) {
            for (int m: freq[j]) {
                res[index++] = m;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}