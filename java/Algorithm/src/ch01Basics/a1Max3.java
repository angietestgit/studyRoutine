package ch01Basics;

import java.util.Scanner;

// 3���� ������ �Է¹ް� �� ��� '�ִ밪' ���ϱ�

public class a1Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��Ͻÿ�: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}

		System.out.println("�ִ밪: "+max);
	}

}
