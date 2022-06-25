package com.lun.bito.api.demo.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] intArray = new int[n];
        String n =sc.nextLine();
        System.out.println(n);
        String str = sc.nextLine();

        String [] strArrary = str.split("\\s+");
        int[] intArray = Arrays.stream(strArrary)
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean flag = true;
        List<Integer> nums = new ArrayList<>();
        for (int j = 0; j < intArray.length - 1; j++) {
            flag = true;
            int sum = 0;
            for (int k = 0; k < intArray.length - 1; k++) {
                if (flag) {
                    k = j;
                    sum = intArray[k] + intArray[k + 1];
                    flag = false;
                } else {
                    sum = sum + intArray[k + 1];
                }
                ;

                nums.add(sum);
            }
        }
        nums =nums.stream().filter((Integer i)->{ return i<0;}).collect(Collectors.toList());
        System.out.println(nums.toString());
        for (int num : intArray) {
            if(num<0){
                nums.add(num);
            }
        }

        System.out.println(nums.size());

    }
}
