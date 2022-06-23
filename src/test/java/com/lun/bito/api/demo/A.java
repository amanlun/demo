package com.lun.bito.api.demo;

public class A {

     static {
         System.out.println("A");
    }

    {
         System.out.println("B");
    }





};

class B extends A{

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

}

class C{
    public static void main(String[] args) {



    }
}