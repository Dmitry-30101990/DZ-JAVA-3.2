package com.company;

public class Main {

    public static void main(String[] args) {
        int transfer = 1300;
        int count = 240;
        int bonus;
        if (transfer > 1000) {
            bonus = transfer / 100;
        }
        else  {
            bonus = 0;
        }

        System.out.print("Accrued bonuses " + bonus + "");
        }
    }