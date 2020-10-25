package z_leetcode.链表;

/**
 * @author ming
 * @description
 * @date 2020/6/20
 */
public class _206_反转链表 {

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
        //ListNode node01 = reverseNode1(node5);
        ListNode node02 = reverseNode2(node5);
    }

    //递归
    public static ListNode reverseNode1(ListNode head){//3 2 1
        if(head==null||head.next==null){
            System.out.println("head的值为："+head.val);
            return head;
        }
        System.out.println("head的值为："+head.val);

        ListNode newHead = reverseNode1(head.next);
        System.out.println("head的值为："+head.val);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //迭代
    public static ListNode reverseNode2(ListNode head){//3 2 1
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead = null;
        int i=1;
        while (head!=null){
            System.out.println("第 "+i+" 次循环！");

            ListNode tmp  = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;

            System.out.println("newHead==="+newHead);
            System.out.println("head==="+head);

            i++;
        }
        return newHead;
        //把原来的head的next存起来tmp，原来的newHead指向head的next，原来的head指向指向newHead，临时tmp指向head
    }


}
