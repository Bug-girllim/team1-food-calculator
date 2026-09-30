package com.team1.food;

public class DivideCalculator {

    public double divideCalculator(int a, int b) {
        if (b > 0) {
            return  a / b;
        } else {
            System.out.println("인원은 1명 이상이어야 합니다.");
            return 0;
        }

    }
}

