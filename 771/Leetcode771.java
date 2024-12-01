
import java.util.HashMap;
import java.util.Map;

class Leetcode771 {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> stoneMap = new HashMap<>();
        for(int i = 0; i < stones.length(); i++){
            stoneMap.merge(stones.charAt(i), 1, Integer::sum);
        }

        int ans = 0;
        for(int i = 0; i < jewels.length(); i++){
            if(stoneMap.containsKey(jewels.charAt(i))){
                ans += stoneMap.get(jewels.charAt(i));
            }
        }
        return ans;
    }
}