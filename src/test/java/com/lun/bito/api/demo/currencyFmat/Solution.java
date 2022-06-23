package com.lun.bito.api.demo.currencyFmat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    void printCurr(Object ls){
        NumberFormat nF = NumberFormat.getCurrencyInstance();
        nF.setCurrency(Currency.getInstance(Locale.US));
        String value=nF.format(ls);
        System.out.println("US: "+value);
        nF.setCurrency(Currency.getInstance(new Locale("tw", "in")));
        value =nF.format(ls);
        System.out.println("India: "+value);
        nF.setCurrency(Currency.getInstance(Locale.CHINA));
        value=nF.format(ls);
        System.out.println("China: "+value);
        nF.setCurrency(Currency.getInstance(Locale.FRANCE));
        value=nF.format(ls);
        System.out.println("France: "+value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution so = new Solution();
        try {
            int num = sc.nextInt();
            so.printCurr(num);
        } catch (Exception e) {
            double num = sc.nextDouble();
            so.printCurr(num);
        }
    }
}
