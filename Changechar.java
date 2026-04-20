class ChangeChar{
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z')
                arr[i] = (char)(arr[i] - 32);
            else if (arr[i] >= 'A' && arr[i] <= 'Z')
                arr[i] = (char)(arr[i] + 32);
        }

        System.out.println("Changed Case: " + new String(arr));
    }
}