package com.lun.bito.api.demo.solution5;

import java.util.*;
import java.util.stream.Collectors;

public class SwitchNumberOddEven {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str= sc.next();
//        StringBuffer sf = new StringBuffer(str);
//        sf.delete(0,1);
//        sf.delete(sf.length()-1,sf.length());
//        String []strArray =sf.toString().split(",");
//        int i = strArray.length-1;
//        int []intArray = new int [i+1];
//        int j=0;
//        for (j = 0; j <= i; j++) {
//
//            intArray [j]=Integer.valueOf(strArray[j]);
//
//        }
        int []intArray ={5,10,6,4,2,11,17};
        System.out.println(Arrays.toString(intArray));

        List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        Collections.sort(list);
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int k = list.size()-1; k>=0; k--) {
            if(list.size()%2==0){
                if(k == list.size()-1){
                    numbers.add(list.get(k));
                }else if (k%2 ==0) {
                    numbers.addFirst(list.get(k));
                }else {
                    numbers.addLast(list.get(k));
                }
            }else {
                if(k == list.size()-1){
                    numbers.add(list.get(k));
                }else if (k%2 ==1) {
                    numbers.addFirst(list.get(k));
                }else {
                    numbers.addLast(list.get(k));
                }
            }


        }
        System.out.println(numbers.toString());

    }

}
