package com.lun.bito.api.demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution3 {
    public static void main(String[] args) {
        Solution3 so = new Solution3();
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        StringBuffer str=new StringBuffer(line);
        so.findNum(str);
        StringBuffer line2= new StringBuffer(sc.nextLine());
        so.findNum(line2);

        StringBuffer line3= new StringBuffer(sc.nextLine());
        so.findNum(line3);

        System.out.println("================================");
        System.out.println(str+"\n"+line2+"\n"+line3);
        System.out.println("================================");

    }
    void findNum(StringBuffer str){

        String reg= "[0-9]{1,}";
        String finalNum= "";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str.toString());
        matcher.find();
        String strNum =matcher.group();
        int num =Integer.parseInt(strNum);
        str.delete(str.indexOf(strNum),str.length());

        if(str.length()<18){
            int cycleNum = str.length();
            for (int i = 0; i < 18-cycleNum; i++) {
                str.append(" ");
            }

        }
        if(10<=num &&num<100){
            finalNum =String.valueOf("0"+num);
        }else if(num<10){
            finalNum =String.valueOf("00"+num);
        }else {
            finalNum =String.valueOf(num);
        }
          str.insert(15,finalNum);
    }
}
