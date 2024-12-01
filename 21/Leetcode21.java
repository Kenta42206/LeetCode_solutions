class Leetcode21 {
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0);
        ListNode res = list;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                res.next = list2;
                list2 = list2.next;
            } else {
                res.next = list1;
                list1 = list1.next;
            }
            res = res.next;
        }

        if(list1 != null){
            res.next = list1;
        }

        if(list2 != null){
            res.next = list2;
        }


        return list.next;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}