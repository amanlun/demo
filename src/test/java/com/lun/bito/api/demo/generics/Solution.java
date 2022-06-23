package com.lun.bito.api.demo.generics;

import java.lang.reflect.Method;

class Printer<T>
{
    T [] array;


    void printArray (T[] array){
        this.array = array;
//        Arrays.stream(this.array).forEach(System.out::println);
        for (T ele:array) {
            System.out.println(ele);
        }
    }

}

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}



