package SortCollectionByAnonymousClass;

import java.util.Objects;

public class Student {
    String name;
    float score;

    Student(String name, float score){
        this.name = name;
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.score, score) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
