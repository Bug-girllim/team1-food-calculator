package com.team1.food;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.println("1. 하루 총 칼로리 계산");
            System.out.print("메뉴 선택 : ");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("아침 칼로리 : ");
                    int breakfast = sc.nextInt();

                    System.out.print("점심 칼로리 : ");
                    int lunch = sc.nextInt();

                    System.out.print("저녁 칼로리 : ");
                    int dinner =sc.nextInt();

                    PlusCalculator calculator = new PlusCalculator();

                    int total = calculator.sumCalories(
                            breakfast,lunch,dinner
                    );

                    System.out.println(
                            "오늘 먹은 칼로리는 " + total + " kcal 입니다."
                    );
                    break;

                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;

                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }
}