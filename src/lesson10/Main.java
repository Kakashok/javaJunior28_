package lesson10;

public class Main {
    public static void main(String[] args) {
        double[][] num1 = {{2, 5, 4, 6},
                {3, 5, 8, 6},
                {2, 5, 7, 9}};

        double[][] num2 = {{6, 4, 5, 2},
                {5, 6, 7, 5},
                {3, 4, 1, 0}};

        double[][] num3 = {{6, 4, 5, 2, 7},
                {5, 6, 7, 5, 2},
                {3, 4, 1, 0, 1},
                {5, 2, 7, 1, 8}};

        double[][] num4 = {{0, 0},
                {0, 0}};

        double[][] num5 = {{1, 5, 4},
                {3, 1, 8},
                {2, 5, 1}};

        double[][] num6 = {{2, 5, 4, 6},
                {3, 5, 8, 6},
                {2, 5, 7, 9},
                {5, 7, 1, 4}};


        Matrix matrix1 = new Matrix(num1);
        Matrix matrix2 = new Matrix(num2);
        Matrix matrix3 = new Matrix(num3);
        Matrix matrix4 = new Matrix(num4);
        Matrix matrix5 = new Matrix(num5);
        Matrix matrix6 = new Matrix(num6);


        matrix1.printToConsole();
        matrix1.setValueAt(0,2, 444);
       double value = matrix1.getValueAt(0,2);
       System.out.println(value);

        IMatrix resultAdd = matrix1.add(matrix2);
        resultAdd.printToConsole();

        IMatrix resultSub = matrix1.sub(matrix2);
        resultSub.printToConsole();

        IMatrix resultMul = matrix1.mul(matrix3);
        resultMul.printToConsole();

        IMatrix resultMulti = matrix1.mul(5);
        resultMulti.printToConsole();

        IMatrix resultTransponse = matrix1.transpose();
        resultTransponse.printToConsole();

        matrix1.fillMatrix(444);
        matrix1.printToConsole();


        System.out.println(matrix1.isNullMatrix());
        System.out.println(matrix4.isNullMatrix());

        System.out.println(matrix1.isIdentityMatrix());
        System.out.println(matrix5.isIdentityMatrix());

        System.out.println(matrix1.isSquareMatrix());
        System.out.println(matrix4.isSquareMatrix());


        System.out.println(matrix6.determinant());

    }

}
