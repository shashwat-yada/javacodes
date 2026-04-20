
import java.util.Scanner;


class large3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a:");
        int a=sc.nextInt();
        System.out.println("b:");
        int b=sc.nextInt();
        System.out.println("c:");
        int c=sc.nextInt();

        int big= ((a>b)?((a>c)?a:c):((b>c)?b:c));
        System.out.println("largest of 3 number: "+big);

    }
}