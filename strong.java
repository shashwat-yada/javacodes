
import java.util.Scanner;


class strong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the integer:");
        int num=sc.nextInt();
        int original=num;
        int temp=0;
        int fact=1;
        int deg=0;

        while(num>0){
            int sum=num%10;
            while(sum>0){
                fact=fact*sum;
                sum=sum-1;
                //temp=fact;
            }
            System.out.println(fact);
            deg=deg+fact;
            System.out.println(deg);
            fact=1;
            num=num/10;
            


            

        }
        if(original==deg){
            System.out.println("strong:");

        }
        else{
            System.out.println("not strong:");
        }
    }
}