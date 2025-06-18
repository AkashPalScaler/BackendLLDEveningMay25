package collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
    //    Collection
    // List, Queue, Set


    //List
    // Ordered collection
    // Random access through index
    // Allows duplicate

    // Lists can be implemented by 4 things 
    // Array, LinkedList, Vector, Stack
    
    //ArrayList
    //Insertion at end TC - O(1) | start/middle - O(n)
    //Random access TC - O(1)
    List<Integer> list1 = new ArrayList<>();

    //Insertion at start/end TC - O(1) | middle - O(n)
    //Random access TC - O(n)
    List<Integer> list2 = new LinkedList<>();
    
    //Thread java, growth is your control -> deprecated
    List<Integer> vector1 = new Vector<>();
    // Thread safe, works LIFO and extends vector
    List<Integer> stack1 = new Stack<>();


    //Queue
    // FIFO - To get processed in a line
    // Priority wise out
    // Reverse priority using comparator/comparable
    Queue<Integer> q = new PriorityQueue<>();

    q.add(5);
    q.add(10);
    q.add(1);

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.poll();
    }


    //Deque extends queue
    // Double ended queue
    Deque<Integer> dll = new LinkedList<>();

    //Set
    // It doesn't allow duplicate elements
    // Random ordered
    Set<Integer> set1 = new HashSet<>();
    // Ordered - Insertion order
    // LinkedList + HashMap
    Set<Integer> set2 = new LinkedHashSet<>();
    // Ordered - Natural order - Reverse using comparator/comparable
    // Balanced BinaryTree - RBT
    Set<Integer> set3 = new TreeSet<>();

    set1.add(19);
    set1.add(10);
    set1.add(21);
    set1.add(5);
    set1.add(15);

    set2.add(19);
    set2.add(10);
    set2.add(21);
    set2.add(5);
    set2.add(15);

    set3.add(19);
    set3.add(10);
    set3.add(21);
    set3.add(5);
    set3.add(15);

    System.out.println(set1);
    System.out.println(set2);
    System.out.println(set3);

    // Random ordered
    Map<String, Integer> map1 = new HashMap<>();
    // Ordered - Insertion order
    // LinkedList + HashMap
    Map<String, Integer> map2 = new LinkedHashMap<>();
    // Ordered - Natural order - Reverse using comparator/comparable
    // BinaryTree - RBT
    Map<String, Integer>  map3 = new TreeMap<>();
    // Break till 10:45
    }
}