import java.util.Scanner;
class Positive
{
    public static void main(String args[])
    {
        int i,c=0,s=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the +ve values of M and N, i.e M<N");
        int M= sc.nextInt();
        int N=sc.nextInt();
        for(i=M;i<=N;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
                c++;
                s=s+i;
            }
        }
         System.out.println("Sum="+s);
         System.out.println("Nos divisible by 3 & 5 are "+c);
    }
}