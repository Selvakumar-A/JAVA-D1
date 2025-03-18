package pogram;

import java.util.Scanner;

public class info {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the name");
		String name = obj.nextLine();

		System.out.println("enter the number");
		int num = obj.nextInt();
		System.out.println("enter the address");
		String add = obj.nextLine();

		obj.nextLine();
	}
}
