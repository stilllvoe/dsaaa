package z_leetcode.链表;

/**
 * @author ming
 * @description
 * @date 2020/6/28
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1);

        Person p2 = p1;

        Person p3 = new Person(3);

        p2 = p3;

        System.out.println(p1);
        System.out.println(p2);
    }
}
