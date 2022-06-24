package com.lun.bito.api.demo.md5;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner su  = new Scanner(System.in);
        String str = su.nextLine();
//            String str = "HelloWorld";  //要加密的字串
            char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes("UTF-8"));
                //Hash計算, 產生128位的長整數
                byte[] bytes = messageDigest.digest();
                StringBuffer sb = new StringBuffer(bytes.length * 2);
                for(Byte b : bytes){
                    //右移四位, 取字節中前四位轉換
                    sb.append(hexDigits[(b >> 4) & 0x0f]);
                    //取字節中後四位轉換
                    sb.append(hexDigits[b & 0x0f]);
                }
                //輸出 68e109f0f40ca72a15e05cc22786f8e6
                System.out.println(sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }


    }
}