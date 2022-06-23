package com.lun.bito.api.demo.solution5;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int answer =scanner.nextInt();
        if(-100<=answer && answer<=100){
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer");
        }

    }
}
