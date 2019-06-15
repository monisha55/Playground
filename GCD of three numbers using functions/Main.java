import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
      int z=gcd(n1,n2);
      System.out.print(gcd(n1,n2));
	}
  public static int gcd(int n1,int n2)
  {
    int m;
    if(n1<n2)
    {
      m=n1;
    }
    else
    {
      m=n2;
    }
    while(m>=1)
    {
      if((n1%m==0)&&(n2%m==0))
      {
        return m;
      }
      m--;
    }
    return 0;
}
}