class CompareString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        boolean equal = true;

        if (s1.length() != s2.length()) {
            equal = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal)
            System.out.println("Strings are equal");
        else
            System.out.println("Not equal");
    }
}