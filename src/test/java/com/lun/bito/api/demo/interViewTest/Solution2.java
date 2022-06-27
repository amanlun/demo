package com.lun.bito.api.demo.interViewTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution2 {

    static int findLIS(int[] s) {
        int count=0;
        int num =s[0];
        for (int i = 0; i < s.length; i++) {
            if(num<s[i]){
                count++;
                num = s[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _s_size = Integer.parseInt(in.nextLine());
        int[] _s = new int[_s_size];
        int _s_item;
        for(int _s_i = 0; _s_i < _s_size; _s_i++) {
            _s_item = Integer.parseInt(in.nextLine());
            _s[_s_i] = _s_item;
        }
        List<Integer> list = Arrays.stream(_s).boxed().collect(Collectors.toList());
        System.out.println(list.toString());
        res = findLIS(_s);
        System.out.println(res);

    }
}



