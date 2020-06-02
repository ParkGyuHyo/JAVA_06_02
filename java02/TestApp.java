package java02;

import java.util.Scanner;

public class TestApp {
	
//	static int kor1;
//	static int kor2;
//	static int kor3;
//	static int total;
//	static double avg;
	
	
	
	static int menu;
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] kors = new int[3];
		boolean flag = true;

		while(flag) {
			
			menu = selectMenu();
	
			switch(menu) {
				case 1:				
					inputScore(kors);
					break;
					
				case 2:
					outputScore(kors);
					break;
					
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	private static void outputScore(int[] kors) {
		//========== 성적 출력
		int total = 0;
		
		for (int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = (double)total / 3;
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력           │");
		System.out.println("└──────────────────┘");		
		
		for (int i = 0; i < 3; i++) {
			System.out.printf(" 국어%d : %d\n", i+1, kors[i]);
		}
		
		System.out.println("--------------------");
		System.out.printf(" 총점 : %d\n",total);
		System.out.printf(" 평균 : %6.2f\n",avg);
		
	}

	private static void inputScore(int[] kors) {
		//========== 성적 입력
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력           │");
		System.out.println("└──────────────────┘");
		
		 for (int i=0; i<kors.length; i++) {
			do {
				
				System.out.printf("국어%d 점수를 입력해주세요: ", i+1);
				kors[i] = in.nextInt();
				
				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
				
			}while (kors[i] < 0 || 100 < kors[i]);
		 }
		 
		System.out.println("--------------------");
	}

	private static int selectMenu() {
		//========== 메뉴 입력
		System.out.println("┌──────────────────┐");
		System.out.println("│      메뉴입력           │");
		System.out.println("└──────────────────┘");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		
		System.out.print("선택 : ");
		
		menu = in.nextInt();
		
		return menu;
	}
}
