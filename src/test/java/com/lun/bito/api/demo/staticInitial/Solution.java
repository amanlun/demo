package com.lun.bito.api.demo.staticInitial;

import java.util.Scanner;

public class Solution {
    static int H;
    static int B;
    static boolean flag=true;
    static{
        Scanner scanner=new Scanner(System.in);
        B=scanner.nextInt();
        H=scanner.nextInt();
        if(B<=0 || H<=0){
            flag=false;
            System.out.println( "java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

    }
}
