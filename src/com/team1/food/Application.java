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
            System.out.println("4. 더치페이");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
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
            }
            System.out.println();

        } while (menu != 0);

    }
}