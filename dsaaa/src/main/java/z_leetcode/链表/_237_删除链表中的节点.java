package z_leetcode.链表;

/**
 * @author ming
 * @description https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @date 2020/6/26
 */
public class _237_删除链表中的节点 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(13);
        ListNode node4 = new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        deleteNode(node2);
        System.out.println(node1);



    }

    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
