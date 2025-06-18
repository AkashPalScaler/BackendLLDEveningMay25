package collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student a, Student b){
        if(a.age > b.age){
            return 1;
        }else{
            return -1;
        }
    }
}
// if(elem1 > elem2){
//  swap(elem1, elem2)
// }

// if(compare(elem1, elem2) == 1){
//  swap(elem1, elem2)
// }