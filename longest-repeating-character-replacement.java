class Solution {
    public int characterReplacement(String str, int k) {
        if(str.length() == 0){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int res = Integer.MIN_VALUE, front = 0, max = Integer.MIN_VALUE ;
        for(int i = 0; i < str.length(); i++){
          map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
          max = Math.max(map.get(str.charAt(i)), max);
          while(max + k < i - front + 1){
            map.put(str.charAt(front), map.get(str.charAt(front)) - 1);
            front++;
          }
          res = Math.max(res, i - front + 1);
        }
        return res;
    }
}