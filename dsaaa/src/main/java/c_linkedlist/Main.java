package c_linkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ming
 * @description
 * @date 2020/6/24
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(30);
        list.add(0,60);
        list.add(list.size(),70);
        list.add(80);
        list.remove(3);
        //预期：60 50 30 80
        System.out.println(list);//size=4,[60,50,30,80]
    }


}
