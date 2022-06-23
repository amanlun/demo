package com.lun.bito.api.demo.endOfFile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str="HEHE 7777\n " +
                    "UOUO ddd\n" +
                    "ddddaaa\n";
        Scanner sc = new Scanner(str);
        StringBuffer bf = new StringBuffer();
        int i =0;
//        String one=sc.nextLine();
//        sc.nextLine();
//        String two=sc.nextLine();
//        sc.nextLine();
//        String three=sc.nextLine();


//        String str = "";
        while (sc.hasNext()){
            i++;
            bf.append(i+" ").append(sc.nextLine().trim()).append("\n");



        }
        System.out.println(bf);
//        System.out.println("1: "+one);
//        System.out.println("2: "+two);
//        System.out.println("3: "+three);
    }
}
