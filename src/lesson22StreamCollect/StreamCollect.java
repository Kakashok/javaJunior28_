package lesson22StreamCollect;

import lesson18InnerClassLesson20.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollect {

    public static void main(String[] args) {

        Students student = new Students("Ivan", "Ivanov", 23, 'm', 3, 7.6);
        Students student2 = new Students("Elena", "Stepanenko", 29, 'f', 2, 6.8);
        Students student3 = new Students("Dima", "Petrov", 23, 'm', 3, 8.4);
        Students student4 = new Students("Pavel", "Mironov", 35, 'm', 5, 9.1);
        Students student5 = new Students("Anna", "Evdokimova", 19, 'f', 1, 7.0);
        Students student6 = new Students("Anna", "Evdokimova", 19, 'f', 1, 7.0);

        List<String> strings = List.of("Mathematics ", "Informatika ");
        student.setStringList(strings);


//        List<Students> collect = Stream.of(student, student2, student3, student4, student5)
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll));

        // невозвращаемая коллекция
//        List<Students> collect = Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.toCollection());

        // возвращает Set
//        List<Students> collect = Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.toSet());

        // возвращает List
//        List<Students> collect = Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.toList());

        // переводим в стринг и соеденили строки
        String collect = Stream.of(student, student2, student3, student4, student5)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(collect);

        //
        String collect2 = Stream.of(student, student2, student3, student4, student5)
                //.map(s -> s.getName())
                .map(Students::getName)
                .collect(Collectors.joining(", ", "", ";"));

        System.out.println(collect2);

//        Map<Character, List<Students>> mapCourse = Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.groupingBy(Students::getSex));
//
//        System.out.println(mapCourse);

//        Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.groupingBy(Students::getSex))
//                .forEach((sex, listStudents) -> System.out.println(sex + ": " + listStudents
//                        .stream()
//                        .map(Students::getName)
//                        .collect(Collectors.toList())));
//

//        Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.partitioningBy(s -> s.getAvgMark() < 7.5))
//                .forEach((sex, listStudents) -> System.out.println(sex + ": " + listStudents
//                        .stream()
//                        .map(Students::getName)
//                        .collect(Collectors.toList())));

//        Map<Boolean, List<Students>> mapAvgMark = Stream.of(student, student2, student3, student4, student5)
//                .collect(Collectors.partitioningBy(s -> s.getAvgMark() < 7.5));
//
//        mapAvgMark.get(false).forEach(s -> {s.setName("Best " + s.getName());
//            System.out.println(s);});
//
//        mapAvgMark.get(true).forEach(s -> {s.setName("Worst " + s.getName());
//            System.out.println(s);});

        IntStream.range(1, 9).forEach(s -> System.out.println("Method range " + s));
        System.out.println();
        IntStream.generate(() -> 8)
                .skip(5)
                .limit(10)
                .forEach(s -> System.out.println("Method generate " + s));
        System.out.println();

        IntStream.iterate(2, num -> ++num).limit(10).forEach(s -> System.out.println("Iterate with 2 params " + s));
        System.out.println();
        IntStream.iterate(2, num -> num < 10, num -> ++num).forEach(s -> System.out.println("Iterate with 3 params " + s));

        IntStream.rangeClosed(1,9).forEach(s -> System.out.println("Method rangeClosed " + s));

        Stream.of(student, student2, student3, student4, student5)
                .flatMapToInt(s -> IntStream.range(0, s.getAge())).forEach(System.out::println);

        Stream.of(student).flatMap(s -> s.getStringList().stream()).forEach(System.out::println);

     //   Stream.of(student).map(s -> s.getStringList()).map(s -> s.get())

    }
}
