import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = {  {1,0,0,0,0},
                            {0,6,0,0,0},
                            {0,0,10,0,0},
                            {0,0,0,12,0},
                            {0,0,0,0,14},
        };

        for (int[] numBox: matrix) {
            System.out.println(Arrays.toString(numBox));
        }

        boolean isTriangular = isTriangularMatrix(matrix);
        System.out.println(isTriangular);


    }

    static boolean isTriangularMatrix(int[][] a) {
        boolean isUpperTrian = true;
        boolean isLowerTrian = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i][j] != 0) {
                    isUpperTrian = false;
                }
            }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i][j] != 0) {
                    isLowerTrian = false;
                }
            }
        }

        return (isUpperTrian && !isLowerTrian) || (isLowerTrian && !isUpperTrian);
    }
}
