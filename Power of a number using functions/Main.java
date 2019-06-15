import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=in.nextInt();
      System.out.print(power_number(n,i));
    }
  public static int power_number(int n,int i)
                       {
                        int power=1;
                         while(i>=1)
                         {
                           power=power*n;
                           i--;
                         }
                         return power;
                       }
                       }