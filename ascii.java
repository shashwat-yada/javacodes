
import java.util.Scanner;

class ascii{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the char");
        char ch=sc.next().charAt(0);

        int asci= (int) ch;

        System.out.println("ascii of the input is: "+asci);
    }
}