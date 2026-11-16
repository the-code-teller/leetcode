class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int threshold = nums.length/3;
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        map.forEach((key, value) -> {
            if(value > threshold) list.add(key);
        });
        return list;
    }
}