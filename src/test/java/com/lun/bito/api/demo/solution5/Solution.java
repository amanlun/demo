package com.lun.bito.api.demo.solution5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();
        int a = 0;
        int b = 0;
        int n = 0;
        int answer = 0;
        int nn =0;

        for (int i = 0; i < 5; i++) {
            String words= reader.readLine();
            String[] word=words.split("\\s+");
            if(word.length>2){
                a =Integer.parseInt(word[0]);
                b =Integer.parseInt(word[1]);
                n =Integer.parseInt(word[2]);
                answer = 0;
                for (int j =1; j <= n; j++) {
                    if(j==1){
                        nn =j*b;
                        answer = a+answer +j*b;
                    }else {
                        nn =nn*2;
                        answer = answer+nn;
                    }
                    buffer.append(answer).append(" ");

                }
                buffer.append("\n");
            }
        }
        System.out.println(buffer.delete(buffer.length()-1,buffer.length()));

    }
}
