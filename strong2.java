import java.util.*;
class strong2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int digit=0;
        int fact=1;
        int sum=0;
        while(temp>0)
        {
            digit=temp%10;
           
            for(int i=1;i<digit+1;i++)
            {
                fact=fact*i;
            }
             System.out.println(fact);
            sum=sum+fact;
             fact=1;
            temp=temp/10;
        }
        if(n==sum)
        System.out.println("It is a strong number");
        else 
        System.out.println(sum+" "+"It is not a strong number");
    }
}