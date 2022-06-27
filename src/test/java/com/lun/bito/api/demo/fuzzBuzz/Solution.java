package com.lun.bito.api.demo.fuzzBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {

            if (n%3 ==0 && n%5 == 0){
                System.out.println("FizzBuzz");
            }else if(n%3==0){
                System.out.println("Fizz");

            }else if(n%5==0){
                System.out.println("Buzz");

            }else {
                System.out.println(n);
            }



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int b = Integer.parseInt(bufferedReader.readLine().trim());
        int c =  Integer.parseInt(bufferedReader.readLine().trim());




        bufferedReader.close();
    }
}
