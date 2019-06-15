import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
      int z=greatest_numbers(n1,n2);
      System.out.print(greatest_numbers(z,n3));
    }
  public static int greatest_numbers(int n1,int n2)
  {int maximum_number=0;
   if(n1>n2)
   {
     maximum_number=n1;
   }
   else
   {
     maximum_number=n2;
   }
   return maximum_number;
  }
      
	}
