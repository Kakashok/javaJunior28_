package lesson10;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int rows, int cols) {
        numbers = new double[rows][cols];
    }

    public Matrix(double[][] numbers) {
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
        if (rowIndex >= this.getRows() || rowIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс строки! Нет такого элемента матрицы");
        }
        if (colIndex >= this.getColumns() || colIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс столбца! Нет такого элемента матрицы");
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {

        if (rowIndex >= this.getRows() || rowIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс строки! Нет такого элемента матрицы");
        }
        if (colIndex >= this.getColumns() || colIndex < 0) {
            throw new IndexOutOfBoundsException("Неверный индекс столбца! Нет такого элемента матрицы");
        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this - первая матрица
        // otherMatrix - вторая матрица

        if (otherMatrix == null) {
            throw new NullPointerException("otherMatrix is null");
        }

        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Кол-во строк матриц не совпадает!!!");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Кол-во колонок матриц не совпадает!!!");
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix == null) {
            throw new NullPointerException("Второй аргумент не может быть нулевым");
        }

        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Кол-во строк матриц не совпадает!!!");

        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Кол-во колонок матриц не совпадает!!!");
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix == null) {
            throw new NullPointerException("Второй аргумент не может быть нулевым");
        }

        if (this.getColumns() != otherMatrix.getRows()) {
            throw new  IllegalArgumentException("Такие матрицы нельзя перемножить. Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы!");
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {

                for (int k = 0; k < this.getRows(); k++) {
                    result.setValueAt(i, j, this.getValueAt(i, k) * otherMatrix.getValueAt(k, j));
                }
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {

        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(j, i, this.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        double result = 0;
        // Matrix temporaryMatrix = new Matrix(this.getColumns() - 1, this.getRows() - 1);
        if (this.isSquareMatrix() == false) {
            System.out.println("Введите квадратную матрицу!");
        } else {
            if (this.getColumns() == 1 && this.getRows() == 1) {
                result = this.getValueAt(0, 0);

            } else if (this.getColumns() == 2 && this.getRows() == 2) {
                result = this.getValueAt(0, 0) * this.getValueAt(1, 1) - this.getValueAt(1, 0) * this.getValueAt(0, 1);
            } else if (this.getColumns() == 3 && this.getRows() == 3) {
                result = this.getValueAt(0, 0) * this.getValueAt(1, 1) * this.getValueAt(2, 2)
                        + this.getValueAt(0, 1) * this.getValueAt(1, 2) * this.getValueAt(2, 0)
                        + this.getValueAt(0, 2) * this.getValueAt(1, 0) * this.getValueAt(2, 1)
                        - this.getValueAt(0, 2) * this.getValueAt(1, 1) * this.getValueAt(2, 0)
                        - this.getValueAt(0, 0) * this.getValueAt(1, 2) * this.getValueAt(2, 1)
                        - this.getValueAt(0, 1) * this.getValueAt(1, 0) * this.getValueAt(2, 2);
            } else {
                for (int i = 0; i < this.getColumns(); i++) {
                    Matrix temporaryMatrix = new Matrix(this.getColumns() - 1, this.getRows() - 1);

                    for (int j = 1; j < this.getColumns(); j++) {
                        for (int k = 0; k < this.getColumns(); k++) {
                            if (k < i) {
                                temporaryMatrix.setValueAt(j - 1, k, this.getValueAt(j, k));
                            } else if (k > i) {
                                temporaryMatrix.setValueAt(j - 1, k - 1, this.getValueAt(j, k));
                            }
                        }
                    }
                    result += Math.pow(-1.0, 1.0 + i + 1.0) * this.getValueAt(0, i) * temporaryMatrix.determinant();
                }

            }
        }

        return result;
    }


    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j && this.getValueAt(i, j) != 1) {
                    return false;
                } else if (i != j && this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printToConsole() {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "   ");

            }
            System.out.println();
        }

    }


}
