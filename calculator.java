
import java.util.Scanner;


class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the vlaue of b");
        int b=sc.nextInt();

        System.out.println("enter the operator : 1==+,2==-,3==*,4==/,5==%");
        int num=sc.nextInt();

        switch (num) {
            case 1 :
                System.out.println("addition:"+(a+b));
                break;
            case 2:
                System.out.println("subtraction:"+(a-b));
                break;
            case 3:
                System.out.println("multiplication:"+(a*b));
                break;
            case 4:
                System.out.println("divison:"+(a/b));
                break;
            case 5:
                System.out.println("modulus:"+(a%b));
                break;

                



                
            default:
                System.out.println("invalid input");
        }

    }
}