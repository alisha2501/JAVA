import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int i,s=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number  ");
        int n=sc.nextInt();
        for(i=1;i<=n;i=i+2)
        {
            s=s+i;
            System.out.print(" " +s);
        }
        
    }
}