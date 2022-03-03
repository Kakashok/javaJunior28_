package lesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class StringUtils {
    // 1 - переменные (могут быть или не быть)
    // 2 - конструкторы (могут быть или не быть)
    // 3 - методы (могут быть или не быть) (psvm  - тоже метод)

    /**
     * Метод, который будет принимать текст и возвращать количество(число) гласных букв в тексте
     * 1 - модификатор доступа (определитель области видимости)
     * public - видимость кода внутри всего проекта
     * protected - видимость внутри текущего пакета, класса и дочернего класса
     * _____ (пусто) - видимость внутри текущего пакета, класса
     * private - только внутри текущего класса
     * <p>
     * 2 - static (пишем либо нет) static не обращаемся к переменной, без - обращаемся
     * <p>
     * 3 - возвращаемый тип (int, string, или любой другой тип)
     * void (если нет возвращаемого типа)
     * <p>
     * 4 - название метода (с маленькой буквы придумываем сами)
     * <p>
     * 5 - входящие параметры (те данные без которых невозможно выполнить данный метод)
     * (int count, int weight, int height) если входящих параметров нет, то - ()
     * <p>
     * 6 - тело (то, что будет выполняться при вызове метода) записывается в {}
     */
    public static int countVowel(String text) {
        // text - все что угодно может быть
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'y') {
                count++;
            }
        }
        return count;
    }

    // метод принимает входящим параметром текст и возвращает текст полностью наоборот каждое слово

    public static String reversedByWords(String text) {
        String[] words = text.split("\\s+");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result + new StringBuilder(words[i]).reverse().toString() + " ";
        }
        return result;
    }

    // метод бпринимает входящим параметром текст и печатает на консоль закодированный его формат
    //(каждую букву меняет на следующую букву в алфавите

    public static void coddingText(String text) {
        // text = qwerty
        String alphabet = "abcdefghijklmnopqrstuvwxyza";
        String result = "";
        for (int i = 0; i < text.length(); i++) {

            int index = alphabet.indexOf(text.charAt(i));
            if (index != -1) {
                result = result + alphabet.charAt(index + 1);
            } else {
                result = result + text.charAt(i);
            }
        }
        System.out.println(result);

    }

    // 1) Передаём в метод текст, а метод возвращает нам кол-во знаков препинания
    // если считается , то название метода с count

    public static int punctuationAmount(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '!' || text.charAt(i) == '?' || text.charAt(i) == ';' || text.charAt(i) == ':' || text.charAt(i) == ',' || text.charAt(i) == '.') {
                count++;
            }
        }
        return count;
    }

    // 2) Передаем в метод 3 стороны треугольника, метод печатает пло его на консоль

    public static double squareTriangle(int katet1, int katet2, int gipotenuza) {
        int p = (katet1 + katet2 + gipotenuza) / 2;
        double square = Math.sqrt(p * (p - katet1) * (p - katet2) * (p - gipotenuza));

        return square;
    }

    // 3) Передаем в метод двухмерный массив чисел, а метод печатает его на консоль

    public static void arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 4) Передаем в метод двухмерный массив, а метод заполняет его случайными числами
    // и возвращает наполненный двухмерный массив

    public static void arrayRandom(int[][] arrayRandomNumbers) {
        var randomFill = new Random();
        for (int i = 0; i < arrayRandomNumbers.length; i++) {
            for (int j = 0; j < arrayRandomNumbers[i].length; j++) {
                arrayRandomNumbers[i][j] = randomFill.nextInt();

            }
        }
        System.out.println(arrayRandomNumbers);
    }
}





