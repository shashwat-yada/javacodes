public class MatrixEquality {
    public static void main(String[] args) {
        int[][] a = {{1, 1}, {1, 1}};
        int[][] b = {{1, 1}, {1, 1}};
        boolean isEqual = true;
        if (a.length != b.length || a[0].length != b[0].length) isEqual = false;
        else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (a[i][j] != b[i][j]) { isEqual = false; break; }
                }
            }
        }
        System.out.println("Equal: " + isEqual);
    }
}

