package java04;

import java.util.Scanner;

public class TestApp {
	
	static int menu;
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
		
		boolean flag = true;

		while(flag) {			
			menu = selectMenu();
	
			switch(menu) {
				case 1:				
					inputScore(list);
					break;
					
				case 2:
					displayScore(list);
//					displayScore(list, 2);
					break;
					
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static void inputScore(ExamList list) {
		//========== ���� �Է�

		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�           ��");
		System.out.println("����������������������������������������");
		
		int kor, eng, math;
		
		do {
			
			System.out.print("���� ������ �Է����ּ���: ");
			kor = in.nextInt();
			
			if (kor < 0 || 100 < kor)
				System.out.println("���� ������(0 ~ 100) ������ϴ�.");
			
		}while (kor < 0 || 100 < kor);	
		
		do {
					
			System.out.print("���� ������ �Է����ּ���: ");
			eng = in.nextInt();
			
			if (eng < 0 || 100 < eng)
				System.out.println("���� ������(0 ~ 100) ������ϴ�.");
			
		}while (eng < 0 || 100 < eng);
		
		do {
			
			System.out.print("���� ������ �Է����ּ���: ");
			math = in.nextInt();
			
			if (math < 0 || 100 < math)
				System.out.println("���� ������(0 ~ 100) ������ϴ�.");
			
		}while (math < 0 || 100 < math);
		
		Exam exam = new Exam();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;
		
		if (exams.length == size) {
			Exam[] temp = new Exam[size+3];
			
			for (int i=0; i<size; i++) {
				temp[i] = exams[i];
			}
			
			list.exams = temp;
		}
		
		list.exams[list.current] = exam;
		list.current++;
		
		System.out.println("--------------------");
	}
	
	private static void displayScore(ExamList list) {
		//========== ���� ���
		displayScore(list, list.current);
	}
	
	private static void displayScore(ExamList list, int size) {
		//========== ���� ���
		int total = 0;
		double avg = 0.0;
		
		System.out.println("����������������������������������������");
		System.out.println("��      �������           ��");
		System.out.println("����������������������������������������");		
		
		for (int i=0; i<size; i++) {
			System.out.printf("%d��° �л��� ������ ����մϴ�.\n", i+1);
			System.out.println("--------------------");
			
			Exam exam = list.exams[i];
			
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			total = kor + eng + math;
			
			avg = (double)total / 3;
			
			System.out.printf(" ���� : %d\n", kor);
			System.out.printf(" ���� : %d\n", eng);
			System.out.printf(" ���� : %d\n", math);
			
			System.out.println("--------------------");
			System.out.printf(" ���� : %d\n",total);
			System.out.printf(" ��� : %.2f\n",avg);
			System.out.println("--------------------");
		}
		
	}

	private static int selectMenu() {
		//========== �޴� �Է�
		System.out.println("����������������������������������������");
		System.out.println("��      �޴��Է�           ��");
		System.out.println("����������������������������������������");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ����");
		
		System.out.print("���� : ");
		
		menu = in.nextInt();
		
		return menu;
	}
}
