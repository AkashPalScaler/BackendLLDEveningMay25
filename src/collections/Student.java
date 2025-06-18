package collections;

public class Student implements Comparable<Student>{
    String name;
    Integer age;
    Integer marks;

    public Student(String name, Integer age, Integer marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int compareTo(Student other){
        // Return 1 it will swap this (1st elem), other(2nd elem)
        // Return -1,0 it will not swap

        //DESC - 10 8 6 4
        // if(this.marks > other.marks){
        //     return -1;
        // }else if(other.marks > this.marks){
        //     return 1;
        // }

        // ASC
        if(this.marks > other.marks){
                return 1;
            }else if(other.marks > this.marks){
                return -1;
            }
        return 0;
    }
}
// if(elem1 > elem2){
//  swap(elem1, elem2)
// }

// if(elem1.compareTo(elem2) == 1){
//  swap(elem1, elem2)
// }

