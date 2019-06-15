import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      int first=number/100;
      int third=number%10;
      int sum=first+third;
      System.out.println(sum);
	}
}