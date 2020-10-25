package b_dynamicarray;

/**
 * @author ming
 * @description
 * @date 2020/6/13 20:01
 */
public class Main {
    public static void main(String[] args) {
        /*DynamicArray array = new DynamicArray(10);

        array.add(1);
        array.add(5);*/

        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("zhansan",22));
        list.add(new Person("zhansan2",22));
        list.add(new Person("zhansan3",23));

        System.out.println(list);
        list.clear();
        System.gc();


    }

}
