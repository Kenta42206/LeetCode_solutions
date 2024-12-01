
import java.util.HashSet;

class Leetcode217 {
    public static  boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for(int num : nums){
            if(numSet.contains(num)){
                return true;
            } else {
                numSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numList1 = new int[]{-4,-2,1,4,8};
        boolean ans1 = containsDuplicate(numList1);
        System.out.println(ans1);
        int[] numList2 = new int[]{2,-1,1};
        boolean ans2 = containsDuplicate(numList2);
        System.out.println(ans2);
        int[] numList3 = new int[]{2,1,1,-1,100000};
        boolean ans3 = containsDuplicate(numList3);
        System.out.println(ans3);
    }
}