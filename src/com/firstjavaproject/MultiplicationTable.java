package com.firstjavaproject;

public class MultiplicationTable {
    void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + 5 * i);

        }
    }

    void print(int table, int from, int to) {
        {
            for (int i = from; i <= to; i++) {
                System.out.println(table + " x " + i + " = " + table * i);
            }
        }
    }
}