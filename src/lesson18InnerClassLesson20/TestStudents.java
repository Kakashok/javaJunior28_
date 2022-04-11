package lesson18InnerClassLesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestStudents {

    static void filteringStudent(List<Students> students, Predicate<Students> predicate) {
        for (Students student : students) {
            if (predicate.test(student)) System.out.println(student);
        }

    }

    static void getAvg(List<Students> studentsList, Function<Students, Integer> function){
        double d = 0;
        for (Students stu1 : studentsList) {
            d += function.apply(stu1);
        }

        System.out.println(d/studentsList.size());
    }

//    static void filteringStudent(List<Students> students, Filter filter){
//        for (Students student : students) {
//            if(filter.check(student)){
//                System.out.println(student);
//            }
//        }
//    }

//    static void filterStudentsByAge(List<Students> students, int age){
//        for (Students student : students) {
//            if(student.getAge() > age){
//                System.out.println(student);
//            }
//        }
//    }

    static void filterStudentsByAvgMark(List<Students> students, double avgMark) {
        for (Students student : students) {
            if (student.getAvgMark() < avgMark) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Students student = new Students("Ivan ", "Ivanov", 23, 'm', 3, 7.6);
        Students student2 = new Students("Elena", "Stepanenko", 29, 'f', 2, 6.8);
        Students student3 = new Students("Dima", "Petrov", 31, 'm', 4, 8.4);
        Students student4 = new Students("Pavel", "Mironov", 35, 'm', 5, 9.1);
        Students student5 = new Students("Anna", "Evdokimova", 19, 'f', 1, 7.0);


//        TreeSet<Students> set = new TreeSet<>(new Comparator<Students>() {
//
//
//            @Override
//            public int compare(Students o1, Students o2) {
//
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        List<Students> list = new ArrayList<>();

//        set.add(student);
//        set.add(student2);
//        set.add(student3);
//        set.add(student4);
//        set.add(student5);
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
// Predicate принимает класс - возвращает boolean

        list.forEach(s4-> {System.out.println(s4); s4.setAge(s4.getAge() + 5);});

        list.removeIf((s -> s.getAge() < 25));

        getAvg(list, s11 -> s11.getCourse());
       // getAvg(list, s11 -> s11.getCourse().doubleValue());

//        filterStudentsByAge(list, 25);
//        System.out.println("_______________");
//        filterStudentsByAvgMark(list, 8.0);
//        System.out.println("_______________");
//        // filteringStudent(list, new FilterImpl());
//
//        filteringStudent(list, new Filter() {
//            @Override
//            public boolean check(Students student) {
//                return student.getCourse() > 2;
//            }
//        });
//lambda выражения только с интерфесами где не больше одного абстрактного метода
        // функциональный интерфейс - интерфейс где не более одного абстрактного метода
        // filteringStudent(list, (Students student1) -> {return student1.getCourse() > 2;}); можно записать как строчка ниже
        filteringStudent(list, s -> s.getCourse() > 2);
        //но так сокращать нельзя когда больше одного параметра
        //filteringStudent(list, (stud, s) -> stud.getCourse() > 2);
        // сокращенную левую часть нельзя сокращать когда больше одного выражения
        // filteringStudent(list, (Students student1) -> {System.out.println(student1); return student1.getCourse() > 2;});
//

        // System.out.println(set);

    }
}

interface Filter {
    boolean check(Students students);
}

//class FilterImpl implements Filter {
//
//    @Override
//    public boolean check(Students student) {
//        return student.getAge() > 25;
//    }
//}

/*
TreeSet<Integer> set = new TreeSet<>();

set.add(1)
set.add(2)
set.add(3)


 */

//Домашнее задание
//написать медоды с лямбда выражениями
//реализация Builder
//пересмотреть урок