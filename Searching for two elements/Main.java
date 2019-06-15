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
      int m1=in.nextInt();
      int m2=in.nextInt();
      int n1=-1;
      int n2=-1;
       for(int i=0;i<=arr_size-1;i++)
       {
         if(m1==arr[i])
         {
           n1=i;
         }
         if(m2==arr[i])
         {
           n2=i;
         }
       }
    
        System.out.println(n1);
        System.out.println(n2);
    }
}