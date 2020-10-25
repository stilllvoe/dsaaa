package z_leetcode.递归;

/**
 * @author ming
 * @description
 * @date 2020/6/21
 */
public class 递归 {
    public static void main(String[] args) {
        //阶乘
        int i = fun1(5);
        System.out.println(i);//120

        //斐波拉契数列 0 1 1 2 3 5 8
        int f2 = fun2(5);
        System.out.println(f2);//5
    }

    /**
     * n的阶乘
     * @param n
     * @return
     */
    public static int fun1(int n){
        if(n<=2){
            return n;
        }
        return n*fun1(n-1);
    }

    /**
     * 斐波拉契数列 0 1 1 2 3 5 8
     * @param n
     * @return
     */
    public static int fun2(int n){
        if(n<=1){
            return n;
        }
        return fun2(n-2)+fun2(n-1);
    }

}
