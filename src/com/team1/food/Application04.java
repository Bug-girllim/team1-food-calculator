package com.team1.food;

import java.util.Scanner;

public class Application04 {

    public double divideCalculator(int a, int b) {
        if (b > 0) {
            return  a / b;
        } else {
            System.out.println("인원은 1명 이상이어야 합니다.");
            return 0;
        }
    }
}
