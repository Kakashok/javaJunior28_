package lesson10;

public class Main {
    public static void main(String[] args) {
        double[][] num1 = {{2, 5, 4, 6},
                           {3, 5, 8, 6},
                           {2, 5, 7, 9}};

        double[][] num2 = {{6, 4, 5, 2},
                           {5, 6, 7, 5},
                           {3, 4, 1, 0}};

        Matrix matrix1 = new Matrix(num1);
        Matrix matrix2 = new Matrix(num2);

//        matrix1.printToConsole();
//        matrix1.setValueAt(0,2, 444);
//        double value = matrix1.getValueAt(0,2);
//        System.out.println(value);

       IMatrix resultAdd = matrix1.add(matrix2);
        resultAdd.printToConsole();


    }

}
