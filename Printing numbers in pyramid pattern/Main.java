import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");}
        for(int c=1;c<=i;c++)
        {
          System.out.print(x+" ");
          x++;
    }   
        System.out.println();
}
    }
}