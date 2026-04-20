
import java.util.Scanner;


class area1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter radius:");
        int radius=sc.nextInt();

        double area = 3.14*radius*radius;

        double circumference= 2*3.14*radius;

        System.out.println("area:"+area);
        System.out.println("circumference: "+circumference);


    }
}