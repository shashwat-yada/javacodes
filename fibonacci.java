class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;

        System.out.println(0);
        System.out.println(1);

        int count = 2;

        while (count < n) {
            int c = a + b;
            System.out.println(c);

            a = b;
            b = c;

            count = count + 1;
        }
    }
}