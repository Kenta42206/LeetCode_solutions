
import java.util.Arrays;

class Leetcode977 {
    public int[] sortedSquares(int[] nums) {
        // numsの値を2乗した値を格納する配列を用意する
        int[] squareList = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            squareList[i] = nums[i] * nums[i];
        }
        
        // 2pointers、並び替えた後の値を格納する配列、配列のインデックスを用紙する。
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;
        int[] res = new int[nums.length];

        // 元の配列が昇順になっているため、最も大きい値は配列の端にある。端端
        // そのため、回答の配列は右側から詰めていくようにする。
        while(left <= right){
            if(squareList[left] > squareList[right]){
                res[i] = squareList[left];
                left++;
            }else{
                res[i] = squareList[right];
                right--;
            }
            i--;
        }

        return res;
    }
}