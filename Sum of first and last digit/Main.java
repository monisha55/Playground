import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
        // Get the value for n
	    int n = in.nextInt();
        int lastdigit = n % 10;
        while(n >= 10)
		{
		   n = n / 10;
		}
      int sum = lastdigit + n;
		System.out.print(sum);
	}
}
	
      
      
