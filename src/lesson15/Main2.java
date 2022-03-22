package lesson15;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        System.out.println(utils.div("324", "54"));


        try {
            System.out.println(Arrays.toString(utils.findNumbers("fghfgh24.235sdfgskg43.2")));
        } catch (CustomException e) {
            e.printStackTrace();
        }


        System.out.println(Arrays.toString(utils.findWord("Вася сорвал с дерева яблоко. Вкусное яблоко.", "яблоко")));


    }
}
