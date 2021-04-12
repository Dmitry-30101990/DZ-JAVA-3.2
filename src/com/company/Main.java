package com.company;

public class Main {

    public static void main(String[] args) {
	int transfer = 1300;
	int count = 240;
	if (transfer > 1000) {
	int bonus = 100;
	int amountbonuses = transfer / bonus;
	System.out.print("Accrued bonuses "+amountbonuses+"");
	}
    }