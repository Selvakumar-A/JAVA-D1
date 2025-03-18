package pogram;
import java.util.Scanner;
public class amount {
	public static void main(String[] args) {
		int amt1,amt2,res;
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter amount 1: ");
		amt1=s.nextInt();
		System.out.println("enter amount 2: ");
		amt2=s.nextInt();
		res=amt1+amt2;
		System.out.println(res);
		if(res<50)
		{
			System.out.println("result is less than 50");
		}
		else {
			System.out.println("result is greater then 50");
		}
	}
}
