
import java.util.HashMap;

class Leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hashmap = new HashMap<>();

        // magazineを構成する文字をhashmapに追加していく。
        // valueにはその文字が登場した回数をインクリメントしていく。
        for(char c : magazine.toCharArray()){
            hashmap.merge(c, 1, Integer::sum);
        }

        // ransomNoteを走査していく。
        // hashmapに追加したmagazineの文字と比較し、あったらデクリメントしていく。
        // 文字が足りなくなったら(valueが0だったら)、falseを返す
        for(char c : ransomNote.toCharArray()){
            if(hashmap.getOrDefault(c, 0) > 0){
                hashmap.put(c, hashmap.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}