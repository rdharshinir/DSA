class Solution {
    String removeDuplicates(String s) {
        Set<Character> seen = new HashSet<>();
        
        StringBuilder res = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                res.append(ch);
            }
        }
        
        return res.toString();
    }
}
