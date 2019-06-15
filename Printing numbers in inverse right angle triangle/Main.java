import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=n;
      for(int i=1;i<=n;i++)
      {
        for(int j=x;j>=1;j--)
        {
          System.out.print(j);
        }
        x--;
        System.out.println();
	}
}
}