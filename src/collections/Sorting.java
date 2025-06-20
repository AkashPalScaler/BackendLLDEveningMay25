package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(24);
        list1.add(21);
        list1.add(20);

        Collections.sort(list1);

        // System.out.println(list1);

        List<Student> students = new ArrayList<>();

        students.add(new Student("Akash", 29, 96));
        
        students.add(new Student("Tushar", 26, 100));
        
        students.add(new Student("Salmanul", 30, 95));
        
        students.add(new Student("Induja", 32, 90));

        Collections.sort(students); // elem1.compareTo(elem2)

        for(Student s: students){
            System.out.println(s.name +" | age:" + s.age + " | marks:" + s.marks);
        }
        System.out.println("*********************************");
        Collections.sort(students, new AgeComparator()); // compare(elem1, elem2)

        for(Student s: students){
            System.out.println(s.name +" | age:" + s.age + " | marks:" + s.marks);
        }


        students.stream()
        .filter((student) -> {
            return student.age >= 30;
        }) 
        .forEach((student) -> {
            System.out.println(student.name);
        });

    }
    
}
