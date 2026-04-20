import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("not prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}