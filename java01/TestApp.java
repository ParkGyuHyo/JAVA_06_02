package java01;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		int kor1;
		int kor2;
		int kor3;
		int total;
		int menu;
		double avg;
		boolean flag = true;
		
		Scanner in = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(flag) {
			//========== 성적 입력
			System.out.println("┌──────────────────┐");
			System.out.println("│       메뉴              │");
			System.out.println("└──────────────────┘");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			
			System.out.print("선택 : ");
			menu = in.nextInt();
			
			switch(menu) {
				case 1:
					//========== 성적 입력
					System.out.println("┌──────────────────┐");
					System.out.println("│      성적입력           │");
					System.out.println("└──────────────────┘");		
					
					do {
						
						System.out.print("국어1 점수를 입력해주세요: ");
						kor1 = in.nextInt();
						
						if (kor1 < 0 || 100 < kor1)
							System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
						
					}while (kor1 < 0 || 100 < kor1);
					
					do {
						
						System.out.print("국어2 점수를 입력해주세요: ");
						kor2 = in.nextInt();
						
						if (kor2 < 0 || 100 < kor2)
							System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
						
					}while (kor2 < 0 || 100 < kor2);
					
					do {
						
						System.out.print("국어3 점수를 입력해주세요: ");
						kor3 = in.nextInt();
						
						if (kor3 < 0 || 100 < kor3)
							System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
						
					}while (kor3 < 0 || 100 < kor3);
					
					System.out.println("--------------------");
					
					break;
				case 2:			
					//========== 성적 출력
					total = kor1 + kor2 + kor3;
					avg = total/3;
					
					System.out.println("┌──────────────────┐");
					System.out.println("│      성적출력           │");
					System.out.println("└──────────────────┘");		
					
					for (int i = 1; i <= 3; i++) {
						System.out.printf(" 국어%d : %d\n", i, kor1);
					}
					
					System.out.println("--------------------");
					System.out.printf(" 총점 : %d\n",total);
					System.out.printf(" 평균 : %6.2f\n",avg);
				
					break;
				case 3:
					flag = false;
					
					break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
