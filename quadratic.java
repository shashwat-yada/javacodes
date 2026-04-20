import java.util.Scanner;

class quadratic{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of c:");
        int c=sc.nextInt();

        int formula = (b*b)-(4*a*c);

        if (formula>0){
            System.out.println("positive");
        }
        else if (formula==0){
            System.out.println("zero");
        }
        else{
            System.out.println("negative");
        }

              
        
        

    }
}