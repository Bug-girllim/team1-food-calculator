package com.team1.food;   // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.println("3. 1인분부터 n인분까지 칼로리 표");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 3: {
                    int kcal;
                    System.out.print("1인분 칼로리 : ");
                    kcal = sc.nextInt();
                    System.out.print("몇 인분까지 : ");
                    int people = sc.nextInt();
                    MultiplyCalculator multiplyCalculator = new MultiplyCalculator();
                    multiplyCalculator.printTable(kcal, people);
                    break;
                }
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