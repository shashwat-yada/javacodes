
import java.util.Scanner;


class charac{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the character");
        char num=sc.next().charAt(0);

        if((num >='a' && num <='z')||(num >='A' && num <='Z')){
            System.out.println("alphabet");
        } 
        else if(num >='0' && num <='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("special character");
        }
    }
}