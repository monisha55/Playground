import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      
      int sum=(number/10)+(number%10);
      System.out.println(sum);
	}
}