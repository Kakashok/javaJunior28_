package lesson4;

public class Main3 {
    public static void main(String[] args) {
        // напечатать в виде шахматной доски
        // 0 0 0 0
        //  0 0 0
        // 0 0 0 0
        //  0 0 0
        // 0 0 0 0
        //  0 0 0

        int[][] chess = new int[8][8];

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }


            }
            System.out.println();

        }

    }
}
