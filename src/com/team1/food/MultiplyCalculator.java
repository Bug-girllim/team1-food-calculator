package com.team1.food;

public class MultiplyCalculator {
    public int multiply(int kcal, int count) {

        return (kcal * count);
    }

    public void printTable(int kcal, int maxCount) {

        for (int i = 1; i <= maxCount; i++) {
            System.out.println(i + "인분 : " + multiply(kcal, i) + "kcal");
        }
    }
<<<<<<< HEAD
=======

>>>>>>> 8b5be9be8e616330c427f3d49f0f8826ce639c84
}