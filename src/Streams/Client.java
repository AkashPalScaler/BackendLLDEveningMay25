package Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
    
        List<Integer> list1 = List.of(2, 5,6,3,1,5,7,6,3, 6, 8, 12, 10, 8, 2);
        
        Stream<Integer> s = list1.stream();
        //Stream will not update original list
        s = s.distinct();
        s = s.limit(4);
        s.forEach((elem) -> {
            System.out.println("Element : " + elem);
        });

        List<Integer> list2 = list1
        .stream()
        .distinct()
        .limit(3)
       .collect(Collectors.toList());


       Optional<Integer> x = list1.stream().distinct().findFirst();

       //To force you to do null check
       if(x.isPresent()){
        System.out.println("First value " + x.get());
       }

       // filter, map, reduce

       List list3 = list1
        .stream()
        .distinct()
        .filter((elem) -> {
            System.out.println("filtering -" + elem);
            return elem%2==0;
        })
        .map((elem1) -> {
            System.out.println("mapping -" + elem1);
            return elem1 *elem1;
        })
        .limit(2)
        .collect(Collectors.toList());

        

        //Reduce - To accumulate
        int sum = 0;
        for(Integer elem:list1){
            sum= sum + elem;
        }

        Integer optSum = list1
        .stream()
        .distinct()
        .reduce(0,(curr_sum, elem) -> {
            // return curr_sum + elem; // gets returned to curr_sum
            if(elem %2 == 0){
                return curr_sum + elem;
            }
            return curr_sum;
        });

       System.out.println("List 3:" + list3);

    
    }
}

