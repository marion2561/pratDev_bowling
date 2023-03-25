package com.example.ex_bowling;

public class Game {
    public static int process(int lancers, int points) {
        int total = 0;
        for (int i = 0; i < lancers; i++) {
            total += points;
        }
        return total;
    }



}