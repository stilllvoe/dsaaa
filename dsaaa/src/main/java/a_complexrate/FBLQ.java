package a_complexrate;

/**
 * @author ming
 * @description
 * @date 2020/6/13 19:48
 */
public class FBLQ {
    public static void main(String[] args) {
        final int index = 50;
        TimeTool.check("fib1", new TimeTool.Task() {
            @Override
            public void execute() {
                System.out.println(fib1(index));//50秒
            }
        });

        TimeTool.check("fib2", new TimeTool.Task() {
            @Override
            public void execute() {
                System.out.println(fib2(index));//0秒
            }
        });
    }
    public static int fib1(int index){
        if(index<=1){
            return index;
        }
        return fib1(index-2)+fib1(index-1);
    }

    public static int fib2(int index){
        if(index<=1)return index;

        int first =0;
        int second = 1;
        for (int i = 0; i <index-1 ; i++) {
            int sum = first+second;
            first = second;
            second = sum;
        }
        return second;
    }

}
