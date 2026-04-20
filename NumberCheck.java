class NumberCheck {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }
        return sum == original;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int num = 28;

        System.out.println("Prime: " + isPrime(num));
        System.out.println("Armstrong: " + isArmstrong(num));
        System.out.println("Perfect: " + isPerfect(num));
    }
}