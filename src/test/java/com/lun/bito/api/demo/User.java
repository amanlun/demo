package com.lun.bito.api.demo;

import java.util.*;

public class User {
    public int id;
    @Override
    public boolean equals(Object obj) {
        if(this ==obj){
            return true;
        }
        if(obj ==null || getClass() != obj.getClass()){
            return false;
        }
        User user = new User();
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

class App{
    public static void main(String[] args) {

//
        List<String> list = Arrays.asList("101 hello","200 marry","101 peter");
        list.stream().filter(a ->a.contains("1")).sorted().forEach(System.out::println);
//        list.add("aa");
//        list.add("ab");
//        list.add("ac");
//        list.add("cc");
//        list.forEach(num -> System.out.println(num));
//        App app = new App();
//        StringBuffer a = new StringBuffer("A");
//        StringBuffer b = new StringBuffer("B");
//        app.aMethod(a,b);
//        b= a;
//        System.out.println(a+":"+b);


    }
    public void start(){
        User eric = new User();
        User peter = new User();
        StringBuffer sss = new StringBuffer();
        sss.append("aaaa").append("6666666");

        eric.id = 1;
        peter.id =1;
        Set<User> users = new HashSet<>();
        users.add(eric);
        users.add(peter);
        users.add(eric);

        for(User user: users){
            user.id =2;
        }
        for (User user:
             users) {
            users.remove(user);
        }
        System.out.println("users size: " +users.size());
    }

    public void aMethod(StringBuffer a,StringBuffer b){
        a.append(b);
        b =a;
//        System.out.println(b);
    }
}