class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<Integer>();
        for(int num:nums){
            store.add(num);
        }
        int ans = 0;
        for(int num:nums){
            int length = 0;
            if(!store.contains(num-1)){
                length++;
                int tmp = num+1;
            
            while(store.contains(tmp++)){
                length++;
            }
        }
        ans = Math.max(ans,length);
        }
        return ans;
    }
}