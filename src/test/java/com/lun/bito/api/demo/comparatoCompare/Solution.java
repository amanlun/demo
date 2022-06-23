package com.lun.bito.api.demo.comparatoCompare;

import java.util.*;

class Checker implements Comparator<Player>{


    @Override
    public int compare(Player o1, Player o2) {
        return (o2.score == o1.score) ? o1.name.compareTo(o2.name) : o2.score - o1.score;
    }
}

class Player{

    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {
    static String[] names = {"amy", "david", "heraldo", "aakansha", "aleksa"};
    static int [] scores = {100, 100, 50, 75, 150};
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();

        Player[] player = new Player[5];
        Checker checker = new Checker();

        for(int i = 0; i < 5; i++){
            player[i] = new Player(names[i], scores[i]);
        }
//        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
