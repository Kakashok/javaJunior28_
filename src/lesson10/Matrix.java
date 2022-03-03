package lesson10;

public class Matrix implements IMatrix{
    private double [][] numbers;

    public  Matrix(int rows, int cols){
        numbers = new double[rows] [cols];
    }

    public Matrix(double[][] numbers){
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(rowIndex >= this.getRows() || rowIndex < 0){
            System.out.println("Неверный индекс строки!!!");
            return -1;
        }
        if (colIndex >= this.getColumns() || colIndex < 0){
            System.out.println("Неверный индекс колонки!!!");
            return -1;
        }
        return numbers[rowIndex] [colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {

        if(rowIndex >= this.getRows() || rowIndex < 0){
            System.out.println("Неверный индекс строки!!!");
            return;
        }
        if (colIndex >= this.getColumns() || colIndex < 0){
            System.out.println("Неверный индекс колонки!!!");
            return;
        }

        numbers[rowIndex] [colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this - первая матрица
        // otherMatrix - вторая матрица

        if(this.getRows() != otherMatrix.getRows()){
            System.out.println("Кол-во строк матриц не совпадает!!!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Кол-во колонок матриц не совпадает!!!");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getColumns(); j++){
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + "   ");

            }
            System.out.println();
        }

    }
}
