import java.util.Scanner;

class oddeve{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of num:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("even");
        
        }

        else{
            System.out.println("odd");
        }


    }
}