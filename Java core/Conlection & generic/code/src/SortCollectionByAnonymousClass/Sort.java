package SortCollectionByAnonymousClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Student> studList = new ArrayList<>();

        studList.add(new Student("Hanna", 83.55f));
        studList.add(new Student("David", 85.55f));
        studList.add(new Student("Annie", 90.61f));
        studList.add(new Student("Tesla", 77.56f));
        studList.add(new Student("Roy", 80.89f));

        for(Student stud:studList) {
            System.out.println(stud.score + " --> " + stud.name);
        }
        System.out.println();
        // create Anonymous Class
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.score < student2.score)
                    return 1;
                return -1;
            }
        };

        Collections.sort(studList, com);
        System.out.println("Avg % --> Name");
        System.out.println("---------------------");


        for(Student stud:studList) {
            System.out.println(stud.score + " --> " + stud.name);
        }
    }
}
