package com.lun.bito.api.demo.solution5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String str ="5,1,3,4,9,8,6,7,2,0";
        String []strArray =str.split(",");
        int i = strArray.length;
        int []intArray = new int [i];
        int j=0;
        for (j = 0; j < i; j++) {
            j++;
            intArray [j]=Integer.valueOf(strArray[j]);
        }
        System.out.println();
        Map map = new HashMap<>();
        map.forEach((k, v) -> System.out.println(k));


        List<String> strings = Arrays.asList(new String[]{"one", "two", "three"});
        String restult ="";
        for (String param :strings             ) {
            restult = restult +param +"&";
        }
        System.out.println(restult);
    }




}
