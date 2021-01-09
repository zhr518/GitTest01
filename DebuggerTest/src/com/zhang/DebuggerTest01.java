package com.zhang;

import java.util.HashMap;

/**
 * @author zhanghaoran
 * @create 2021-01-09 15:16
 */
public class DebuggerTest01 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            System.out.println(i);

        }

        HashMap<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        System.out.println("操作前:");
        System.out.println(map);

        String age = map.get("age");  //可以使用alter + enter 获得String age
        System.out.println(age);  //age.sout
        System.out.println("age = " + age); //soutv 此时的age是一个变量

        map.remove("major");
        System.out.println("操作后:");
        System.out.println(map);

    }
}
