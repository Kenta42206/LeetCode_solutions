// Problem URL: https://leetcode.com/problems/linked-list-cycle

class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy; 
        ListNode fast = dummy; 

        while(fast != null || fast != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}