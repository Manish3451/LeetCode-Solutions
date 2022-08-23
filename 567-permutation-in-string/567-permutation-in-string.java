class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        int length1 = s1.length();
        int length2 = s2.length();
        
        for(int i = 0; i  < length1; i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i = 0; i <= length2-length1; i++){
            String str = s2.substring(i,i+length1);
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(int j = 0; j < length1; j++){
                map2.put(str.charAt(j),map2.getOrDefault(str.charAt(j),0)+1);
            }
            if(map1.equals(map2))return true;
        }
        return false;
     }
}