package com.lun.bito.api.demo.stringPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution  {
    String upperCaseFirst(String str){
        char[] chars=str.toCharArray();
        chars[0] =Character.toUpperCase(chars[0]);
        return new String(chars);
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        StringBuffer bf= new StringBuffer();


        bf.append(so.upperCaseFirst(A)).append(so.upperCaseFirst(B));
        int size = bf.length();
        bf.insert(A.length()," ");
        List<String> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        Collections.sort(list);
        System.out.printf("%d\n%s\n%s",size,A.equals(list.get(0))?"Yes":"No","A",bf);

    }



}
