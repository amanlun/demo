package com.lun.bito.api.demo.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TrySolutionBySelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,y;
        ArrayList[] arrayLists = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            int eachNum = sc.nextInt();
            arrayLists[i] = new ArrayList<>();
            for (int j = 0; j < eachNum; j++) {
                arrayLists[i].add(sc.nextInt());
            }
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            x=sc.nextInt();
            y=sc.nextInt();
            try {
//                System.out.printf("x:%d y:%d ",x,y);
                int answer =(int)arrayLists[x-1].get(y-1);
                System.out.println(answer);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
