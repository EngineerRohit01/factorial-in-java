import java.util.Scanner;

public class Solution{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter number: ");
	int num = input.nextInt();
	int fact = build(num);
	System.out.print("the factorial of " + num + " is " + fact);
	}
	
	public static int build(int num){
	if(num<2){
	return 1;
	}
	int fact =1;
	int i = 2;
	while(i<=num){
	fact = fact*i;
	i++;
	}
	return fact;
	}
}