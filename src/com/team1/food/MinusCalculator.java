package com.team1.food;

public class MinusCalculator {
    public int MinusCalculator (int a, int b) {
        return (a - b);
    }

    public void MinusJudge (int a) {
        if (a > 0) {
            System.out.println(a + " kcal 더 먹을 수 있습니다.");
        }
        else if (a == 0) {
            System.out.println("목표를 정확히 채웠습니다.");
        }
        else {
            System.out.println(Math.abs(a) + " kcal 초과했습니다.");
        }
    }
}
