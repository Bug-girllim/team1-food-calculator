# 자취생 식단 계산기 (1팀)

혼자 밥 해 먹는 사람을 위한 계산기입니다. 하루 칼로리를 관리하고, 재료를 n인분으로 환산하고, 배달비를 나눕니다.

## 팀원과 담당 기능

| 메뉴 | 기능                 | 담당          | 클래스             | 메소드 이름   | Issue | PR  |
|------|----------------------|---------------|--------------------|---------------|-------|-----|
| 1    | 오늘 먹은 칼로리 합계 | 최은정 (팀장) | PlusCalculator     | sumCalories | #3    | #8  |
| 2    | 남은 칼로리          | 김동윤        | MinusCalculator    | MinusCalculator, MinusJudge  | #6    | #7  |
| 3    | n인분 칼로리 표      | 조성원        | MultiplyCalculator | multiply, printTable | #5    | #10  |
| 4    | 배달 더치페이        | 이종민        | DivideCalculator   | divideCalculator | #4    | #9  |

## 실행 화면

<img width="526" height="358" alt="image" src="https://github.com/user-attachments/assets/c57c8eb0-cb4a-4a35-a92d-701c673082b4" />

## 충돌 해결 기록

- PR #9 : 메뉴 2번과 4번 줄이 충돌. 두 줄 모두 남김
- PR #7 : 메뉴 2번과 3번 줄이 충돌, 두 줄 모두 남김. 메뉴와 케이스 번호순 정렬

## 협업하며 배운 점

- 변수명은 안겹치게 미리 합의를 보자
- 모든 PR 본문에 closes #N 을 추가해야지 merge 후 Issue가 닫힌다 ( 이번에는 우리가 수동으로 닫음)

