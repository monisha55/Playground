import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      //int i=in.nextInt();
      for(int i=1;i<=n;++i){
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
        }
        for(int c=1;c<=(2 * i - 1);++c)
      
        {
      System.out.print("*");
      
}
  System.out.print("\n");
}
}
}
