class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null || s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> count = new HashMap<>();
        
        for(int i = 0;  i < s.length(); i++){
            char ch = s.charAt(i);
            count.put(ch,count.getOrDefault(ch,0)+1);
        }
        for(int i = 0;  i < t.length(); i++){
            char ch = t.charAt(i);
            Integer count1 = count.get(ch);
            if (count1 == null) {
                return false;
            }
            if(count1.equals(1)){
                count.remove(ch);
            }
            else{
                  count.put(ch, count1 - 1);
            }
        }
        return true;
    }
}