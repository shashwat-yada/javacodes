import java.util.Scanner;

class celsius{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter celsius: ");
        double celsius=sc.nextInt();

        //converting celsius into fahrenhiet

        double fahrenhiet=celsius*1.8+32;

        System.out.println("fahrenhiet: "+fahrenhiet);
    }
}