package z_leetcode.链表;

/**
 * @author ming
 * @description
 * @date 2020/6/21
 */
public class _203_移除链表元素 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

        ListNode node11 = new ListNode(100);
        ListNode node21 = new ListNode(200);
        ListNode node31 = new ListNode(300);
        ListNode node211 = node21;
        node11.next = node21;
        node21.next=node31;
        System.out.println(node211);



        ListNode node = removeElements(node1, 3);
        System.out.println(node);

    }

    public static ListNode removeElements(ListNode head,int val){
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val){
                prev.next = curr.next;
            } else{
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }
}
