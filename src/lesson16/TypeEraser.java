package lesson16;

import java.util.List;

public class TypeEraser {
    public static void main(String[] args) {

//        List<String> strings = new ArrayList<>();
//
//        List strings1 = new ArrayList();
//
//        String s = (String) strings1.get(0);

        //OtherMethod4.abc();

        OtherMethod4 otherMethod4 = new OtherMethod4();

        //otherMethod4.abcNonStatic();

        List<Integer> integers = List.of(1, 2, 3, 4);
        Integer i = OtherMethod4.abc(integers);
        System.out.println(i);
        Number number = OtherMethod4.abcNonStatic(integers);
        System.out.println(number.intValue());

    }
}

class OtherMethod {

    public <T> T abc(T value) {

        return value;

    }
}

class OtherMethod2<T> {

    public T abc(T value) {

        return value;

    }
}

class OtherMethod3<T extends Number> {

    public T abc(T value) {

        return value;

    }
}

class OtherMethod4 {

    public static <T extends Number> T abc(List<T> value) {

        return value.get(1);

    }

    public static Number abcNonStatic(List<? extends Number> value) {
        Integer result = null;
        for (Number values : value) {
            result += (Integer) values;
        }
        //System.out.println(result);

        return result;
    }
}

