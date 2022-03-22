package lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double num1 = 0;
        try {
            num1 = Double.parseDouble(number1);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 is not a number");
        }

        double num2 = 0;
        try {
            num2 = Double.parseDouble(number2);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 is not a number");
        }

        if (num2 == 0.0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }

        return num1 / num2;
    }

    @Override
    public String[] findWord(String text, String word) throws NullPointerException {
        List<String> keyWords = new ArrayList<>();
        List<String> howManyWords = new ArrayList<>();
        keyWords.add(word);

        String words = new String();
        String patternString = "\\b(" + String.join("|", keyWords) + ")\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words = matcher.group(1);
            howManyWords.add(words);
        }
        if (howManyWords.isEmpty()){
            throw new NullPointerException("Текст не содержет требуемого слова \"" + word + "\"");
        }
        String[] result = new String[howManyWords.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = howManyWords.get(i);
        }
        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<Double> numbers = new ArrayList<>();

        Pattern p = Pattern.compile("(\\d+(?:\\.\\d+))");
        Matcher m = p.matcher(text);
        while (m.find()) {
            double d = Double.parseDouble(m.group(1));
            numbers.add(d);
        }
        if (numbers.isEmpty()) {
            throw new CustomException("В данном тексте нет цифр");
        }

        double[] result = new double[numbers.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.get(i);
        }

        return result;

    }
}
