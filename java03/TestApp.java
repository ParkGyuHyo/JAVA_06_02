package java03;

import java.util.Scanner;

public class TestApp {
	
	static int menu;
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		
		boolean flag = true;

		while(flag) {
			
			menu = selectMenu();
	
			switch(menu) {
				case 1:				
					inputScore(exams);
					break;
					
				case 2:
					outputScore(exams);
					break;
					
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	private static void outputScore(Exam[] exams) {
		//========== 성적 출력
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력           │");
		System.out.println("└──────────────────┘");		
		
		for (int i=0; i<exams.length; i++) {
			System.out.printf("%d번째 학생의 성적을 출력합니다.\n", i+1);
			System.out.println("--------------------");
			
			Exam exam = exams[i];
			
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			int total = kor + eng + math;
			
			double avg = (double)total / 3;
			
			System.out.printf(" 국어 : %d\n", kor);
			System.out.printf(" 영어 : %d\n", eng);
			System.out.printf(" 수어 : %d\n", math);
			
			System.out.println("--------------------");
			System.out.printf(" 총점 : %d\n",total);
			System.out.printf(" 평균 : %.2f\n",avg);
			System.out.println("--------------------");
		}
		
	}

	private static void inputScore(Exam[] exams) {
		//========== 성적 입력

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력           │");
		System.out.println("└──────────────────┘");

		for (int i=0; i<3; i++) {
			int kor, eng, math;
			
			System.out.printf("%d번째 학생의 성적을 입력합니다.\n", i+1);
			System.out.println("--------------------");
			
			do {
				
				System.out.print("국어 점수를 입력해주세요: ");
				kor = in.nextInt();
				
				if (kor < 0 || 100 < kor)
					System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
				
			}while (kor < 0 || 100 < kor);	
			
			do {
						
				System.out.print("영어 점수를 입력해주세요: ");
				eng = in.nextInt();
				
				if (eng < 0 || 100 < eng)
					System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
				
			}while (eng < 0 || 100 < eng);
			
			do {
				
				System.out.print("수학 점수를 입력해주세요: ");
				math = in.nextInt();
				
				if (math < 0 || 100 < math)
					System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
				
			}while (math < 0 || 100 < math);
			
			Exam exam = new Exam();
			
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			exams[i] = exam;
			
			System.out.println("--------------------");
		}
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
