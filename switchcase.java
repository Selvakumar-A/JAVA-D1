package pogram;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1.addtion: ");
		System.out.println("2.subraction: ");
		System.out.println("3.multiplication: ");
		System.out.println("4.division: ");
		
		System.out.println("enter the choice (1 2 3 4) ");
		int choice = s.nextInt();
		
		System.out.println("enter the number1: ");
		double n1=s.nextDouble();
		
		System.out.println("enter the number1: ");
		double n2=s.nextDouble();
		
		double result;
		
		switch(choice) {
		
		case 1:
			result=n1+n2;
			System.out.println("Result: "+result);
			break;
		case 2:
			result=n1-n2;
			System.out.println("Result: "+result);
			break;
		case 3:
			result=n1*n2;
			System.out.println("Result: "+result);
			break;
		case 4:
			if(n2!=0) {
				result=n1/n2;
				System.out.println("Result: "+result);
			}else {
				System.out.println("ERROR");
			}
			break;
			default:
				System.out.println("invalid option");
		}
		}
}
