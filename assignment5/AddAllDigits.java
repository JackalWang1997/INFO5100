package assignmentweek2;

import java.util.Scanner;

public class AddAllDigits {
   public static int digSum(int a) {
	  int sum = 0;
	  while(a>0||sum>9) {
		  if(a==0) {
			  a=sum;
			  sum=0;
		  }
		  sum += a%10;
		  a/=10;
	  }
	  return sum;
  }

public static void main(String args[]) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("please enter a number");
	  int b=input.nextInt();
	  System.out.println(digSum(b));
}
}
