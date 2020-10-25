package z_leetcode.链表;

/**
 * @author ming
 * @description 判断一个里链表是否有环
 * @date 2020/6/21
 */
public class _141_环形链表 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node5.next=node4;
        node4.next=node3;
        node3.next=node2;
        node2.next=node1;
        node1.next=node3;
        boolean flag = hasCycle(node5);
        System.out.println(flag);

    }

    public static boolean hasCycle(ListNode head){
        //head为null,head.next为null,则返回false;
        if(head==null||head.next==null){
            return false;
        }
        //当快指针指向的node为空或者node.next为null,则结束循环
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

}
