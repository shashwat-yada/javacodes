class RemoveNonAlpha {
    public static void main(String[] args) {
        String str = "He110 W0rld!";
        String result = "";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                result += ch;
            }
        }

        System.out.println("Result: " + result);
    }
}