
import java.util.Scanner;


class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num");
        int num=sc.nextInt();
        int temp=num;
        int original=num;
        int count=0;
        while(original!=0){
            original=original/10;
            count=count+1;
            


        }
        int r=0;

        if(num>0){
            int sum=num%10;
            r=r+(sum^count);
            num=num/10;

        }
        if (temp==original){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}