package ch01Basics;

import java.util.Scanner;

// ���� �Ǵܰ� �б�
// �Է��� �������� ��ȣ�� �Ǵ��Ͽ� ����ϴ� ���α׷�

public class a3JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("����Դϴ�.");
		} else if(num<0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
	
		sc.close();
	}
}
