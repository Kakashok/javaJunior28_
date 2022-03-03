package lesson7;

public class Student {
    private int age;
    private String name;

    public Student() {
    }


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int perimetreTreug(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        // ссылка this - объект у которого вызван данный метод (student1)
        // o, student - второй студент (student2)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;

        // тернарный оператор
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //создать классы круг треуг прямоуг квадрат овал трапеция
    // наследования, методы структура extends и тд
}
