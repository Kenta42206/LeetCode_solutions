
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

class Leetcode20 {
    public boolean isValid(String s) {
        Map<Character, Character> hashmap = new HashMap<>();
        hashmap.put(')', '(');
        hashmap.put('}', '{');
        hashmap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // 括弧の始まりであればstackに追加する。
            // それ以外の場合はstackの先頭とi文字目の閉じ括弧がペアでなければfalseを返す
            if(s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || !Objects.equals(stack.pop(), hashmap.get(s.charAt(i)))) {
                    return false;
                }
            }
        }

        // return trueにすると以下の場合trueが返ってしまうため、stack内に値があるかを返す
        // ex) "({["
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}