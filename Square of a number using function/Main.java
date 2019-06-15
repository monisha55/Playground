import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(square_number(n));
	} 
  public static int square_number(int a)
  {
    int s=a*a;
    return s;
}
  
}