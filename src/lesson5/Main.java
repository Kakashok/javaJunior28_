package lesson5;

public class Main {
    public static void main(String[] args) {
        int result = StringUtils.countVowel("kghdh dfhdhqweqeqw dfdkldsjfakq");
        int result2 = StringUtils.countVowel("qelofvkosnc");

        System.out.println(result);
        System.out.println(result2);

        System.out.println(StringUtils.reversedByWords("Hello World!"));

        StringUtils.coddingText("hello world!");

        System.out.println();
        System.out.println("Первое задание");

        // 1)
        int resultPunctuation = StringUtils.punctuationAmount("afk. fja; asfasf? fjiajfiasj, asdk; asdj!");
        System.out.println(resultPunctuation);
        System.out.println();
        System.out.println("Второе задание");

        // 2)
        double square = StringUtils.squareTriangle(5, 6, 7);
        System.out.println(square);
        System.out.println();
        System.out.println("Третье задание");

        // 3)
        int[][] array = {{2, 3, 5, 7, 8}, {3, 6, 8, 1, 4}};
        StringUtils.arrayPrint(array);
        System.out.println();
        System.out.println("Четвертое задание");

        // 4)
        int[][] arrayRandomNumbers = new int[5][6];
        StringUtils.arrayRandom(arrayRandomNumbers);


    }
}
