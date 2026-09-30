package com.team1.food;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MinusCalculator mcal = new MinusCalculator();

        Scanner sc = new Scanner(System.in);

        int menu;
        do {
            System.out.println("===== [버그걸림] 식단 계산기 =====");
            System.out.println("2. 남은 칼로리 계산");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.println("4. 더치페이");
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
                case 4:
                    System.out.println("더치페이를 선택하셨습니다.");
                    System.out.print("음식 가격 입력 : ");
                    int foodprice = sc.nextInt();
                    System.out.print("총 인원 수 : ");
                    int people = sc.nextInt();
                    Application04 app4 = new Application04();
                    double pay= app4.divideCalculator(foodprice, people);

                    System.out.println("1인당 : " + pay + "원 입니다.");
                    break;

                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
                case 2:
                    System.out.println("목표 칼로리는 얼마입니까?");
                    int goal = sc.nextInt();

                    System.out.println("먹은 칼로리는 얼마입니까?");
                    int eaten = sc.nextInt();

                    int minusresult = mcal.MinusCalculator(goal, eaten);
                    System.out.println("메뉴 선택 : 2");
                    System.out.println("목표 칼로리 : " + goal);
                    System.out.println("먹은 칼로리 : " + eaten);
                    mcal.MinusJudge(minusresult);
            }
            System.out.println();

        } while (menu != 0);
    }


    }

