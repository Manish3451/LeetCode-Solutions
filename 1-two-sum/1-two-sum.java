class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a [] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            // int result = target - a[i];
            
            if (map.containsKey(target - nums[i])){
                a[0] = i;
                a[1] = map.get(target - nums[i]);
            }
            else{
            map.put(nums[i],i);
            }
        }
        return a;
    }
}