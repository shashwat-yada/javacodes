public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        boolean isSymmetric = true;
        if (matrix.length != matrix[0].length) isSymmetric = false;
        else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false; break;
                    }
                }
            }
        }
        System.out.println("Symmetric: " + isSymmetric);
    }
}
