
import java.util.Scanner;


class sumof{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the integer:");
        int num=sc.nextInt();
        int temp=0;

        while(num>0){
            int sum=num%10;
            temp=temp+sum;
            num=num/10;

        }
        System.out.println("sum of digit: "+temp);
    }
}