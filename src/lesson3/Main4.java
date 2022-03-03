package lesson3;

public class Main4 {
    public static void main(String[] args) {
        // сдвинуть на одну ячейку и поместить в новый массив
        int[] numbers = {2, 6, 4, 5, 9, 4};

        int[] result = new int[numbers.length];

//        result[0] = numbers[5];
//
//        result[1] = numbers[0];
//        result[2] = numbers[1];
//        result[3] = numbers[2];
//        result[4] = numbers[3];
//        result[5] = numbers[4];

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                result[i] = numbers[numbers.length - 1];

            } else {
                result[i] = numbers[i - 1];

            }
            System.out.println(result[i]);

        }


    }
}
