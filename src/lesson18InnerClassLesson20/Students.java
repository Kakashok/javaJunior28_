package lesson18InnerClassLesson20;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private String name;
    private String lastname;
    private Integer age;
    private Character sex;
    private Integer course;
    private Double avgMark;
    private List<String> stringList = new ArrayList<>();

    public Students(String name, String lastname, Integer age, Character sex, Integer course, Double avgMark) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgMark = avgMark;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(Double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgMark=" + avgMark +
                '}';
    }
}
