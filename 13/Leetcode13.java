
import java.util.HashMap;
import java.util.Map;

class Leetcode13 {
    public int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int i = 0;
        int ans = 0;
        int len = s.length() - 1;

        // イテレータが文字数以下の間ループさせる
        while(i <= len){
            // イテレータが文字数未満でi文字目がi+1文字目より小さい場合は大きい値から小さい値を引いた値となる。
            // 2文字消費するため、イテレータを2進める
            // 例："IV" → 4 (5-1)、"XL" → 40 (50-10)
            if(i < len && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
                ans += romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                i = i + 2;
            // それ以外の場合は単純にi文字目に対応する値を足し、イテレータを1進める
            } else {
                ans += romanMap.get(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}