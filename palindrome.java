
import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value :");
        int n=sc.nextInt();
        int sum=n;
        int count=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            count=count*10+r;


            
        }
        if(sum==count){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }



    }
}