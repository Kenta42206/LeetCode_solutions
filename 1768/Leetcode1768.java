class Leetcode1768 {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int word1Length = word1.length();
        int word2Length = word2.length();
        int a = 0;
        int b = 0;

        // どちらかが文字列の末尾にたどり着くまでansに文字を追加していく
        while(a < word1Length && b < word2Length){
            ans += word1.charAt(a);
            a++;
            ans += word2.charAt(b);
            b++;
        }

        // 追加しきれなかった文字を追加する
        while(a < word1Length){
            ans += word1.charAt(a);
            a++;
        }

        while(b < word2Length){
            ans += word2.charAt(b);
            b++;
        }

        return ans;
    }

    public String mergeAlternatelyMoreFasterAnswer(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int a = 0;
        int b = 0;

        // どちらかが文字列の末尾にたどり着くまでansに文字を追加していく
        while(a < word1Length && b < word2Length){
            ans.append(word1.charAt(a));
            a++;
            ans.append(word2.charAt(b));
            b++;
        }

        // 追加しきれなかった文字を追加する
        while(a < word1Length){
            ans.append(word1.charAt(a));
            a++;
        }

        while(b < word2Length){
            ans.append(word2.charAt(b));
            b++;
        }

        return ans.toString();
    }
}