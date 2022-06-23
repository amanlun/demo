package com.lun.bito.api.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafe {
    public static void main(String[] args) {
        Integer[] a = {5, 10, 6, 8, 3, 20, 6, 7, 15 ,9};
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);

        //        System.out.println(Arrays.stream(a).sorted());
//        int first = a[0];
//        int second = 0;
//
//        for (int i = 0; i < a.length; i++) {
//
//            if (first < a[i]) {
//                first = a[i];
//
//            }else if(second < a[i]){
//                second = a[i];
//
//            }


//        for (int i = 0; i < a.length; i++) {
//            //                System.out.println(a[i]);
//            if(second < a[i] && first != a[i]){
//                second = a[i];
//            }
//
//        }
       list.forEach(num ->System.out.println(num));
//        System.out.println("num1: " + first + " ,num2: " + second);

    }
}
