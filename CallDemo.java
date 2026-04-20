class CallDemo {

    static void callByValue(int x) {
        x = x + 10;
        System.out.println("Inside function (Value): " + x);
    }

    static void callByReference(int[] arr) {
        arr[0] = arr[0] + 10;
        System.out.println("Inside function (Reference): " + arr[0]);
    }

    public static void main(String[] args) {
        int a = 5;
        callByValue(a);
        System.out.println("After call (Value): " + a);

        int[] arr = {5};
        callByReference(arr);
        System.out.println("After call (Reference): " + arr[0]);
    }
}