
import java.util.Scanner;


class days{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the days:");
        double days=sc.nextDouble();

        double year=days/365;
        double weeks=days/52;
        System.out.println("year: "+year);
        System.out.println("weeks: "+weeks);
        System.out.println("days: "+days);


    }
}