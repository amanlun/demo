package com.lun.bito.api.demo.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TeamPractice {

    public static void main(String[] args) {
        String aaa = "{9,5,3,7,6,2,45,6,5,5,8}";
        List<Integer> list= new ArrayList<Integer>();
        aaa =aaa.substring(1,aaa.length()-1);
        String []aaaArray = aaa.split(",");
        List<String> bbb=Arrays.stream(aaaArray).sorted().collect(Collectors.toList());
        Arrays.stream(aaaArray).forEach(i ->{list.add(Integer.valueOf(i));});
        Collections.sort(list);
//        System.out.printf("%s",bbb.toString());
    }
}
