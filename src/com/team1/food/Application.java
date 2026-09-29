package com.team1.food;   // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [버그걸림] 식단 계산기 =====");
            System.out.println("2. 남은 칼로리 계산");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
                case 2:
                    System.out.println("목표 칼로리는 얼마입니까?");
                    Scanner g = new Scanner(System.in);
                    int goal = g.nextInt();

                    System.out.println("먹은 칼로리는 얼마입니까?");
                    Scanner e = new Scanner(System.in);
                    int eaten = e.nextInt();

                    System.out.println("목표 칼로리 : " + goal);
                    System.out.println("먹은 칼로리 : " + eaten);
                    if (goal- eaten > 0) {
                        System.out.println((goal - eaten) + " kcal 더 먹을 수 있습니다");
                    }
                    else if (goal - eaten == 0) {
                        System.out.println("목표를 정확히 채웠습니다");
                    }
                    else {
                        System.out.println((eaten-goal) + " kcal 초과했습니다");
                    }

            }
            System.out.println();

        } while (menu != 0);
    }
    }
