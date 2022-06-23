package com.lun.bito.api.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = read.readLine();
        while (line != null) {
            try {
                BigDecimal num= new BigDecimal(line);
                BigDecimal finalNum =num.remainder(new BigDecimal(2));
                boolean isEven=finalNum.compareTo(BigDecimal.ZERO)==0;
                boolean twoToFive =num.compareTo(new BigDecimal(2))>=0 &&
                        num.compareTo(new BigDecimal(5))<=0;
                boolean sixToTwenty =num.compareTo(new BigDecimal(6))>=0 &&
                        num.compareTo(new BigDecimal(20))<=0;
                boolean overTwenty =num.compareTo(new BigDecimal(20))>=0;

                if(isEven && twoToFive|| (isEven&&overTwenty)){
                    System.out.println("Not Weird");

                }else if(!isEven||(isEven && sixToTwenty)){
                    System.out.println("Weird");
                }else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            sb.append(line);
            line = read.readLine();
            }
        }







}