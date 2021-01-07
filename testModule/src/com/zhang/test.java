package com.zhang;

import java.util.ArrayList;

/**
 * @author zhanghaoran
 * @create 2021-01-07 22:58
 */
public class test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add("qwe");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
