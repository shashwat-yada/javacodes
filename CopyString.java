class CopyString {
    public static void main(String[] args) {
        String str1 = "Hello";
        char[] arr = str1.toCharArray();
        char[] copy = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        String str2 = new String(copy);
        System.out.println("Copied: " + str2);
    }
}