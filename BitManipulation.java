class BitManipulation {
    public static void main(String[] args) {
        int num = 5; // 101

        // Check kth bit
        int k = 2;
        System.out.println("Is bit set: " + ((num & (1 << k)) != 0));

        // Toggle kth bit
        System.out.println("After toggle: " + (num ^ (1 << k)));

        // Count bits
        int n = 5;
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("Set bits: " + count);
    }
}