import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int m;
      if(arr[0]>arr[1])
      {
        m=arr[0];
      }
      else
      {
        m=arr[1];
      }
      for(int i=0;i<=arr_size-1;i++)
      {
        if(m<=arr[i])
        {
          m=arr[i];
        }
      }
      System.out.println(m);
      
      
    }
}