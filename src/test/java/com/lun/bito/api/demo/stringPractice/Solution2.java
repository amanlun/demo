package com.lun.bito.api.demo.stringPractice;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
        char []chars= S.toCharArray();
        for (int i = start; i < end; i++) {
            System.out.print(chars[i]);
        }


    }
}
