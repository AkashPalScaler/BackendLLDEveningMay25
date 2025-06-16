package Generics;

public class Pair<V, T> {
    V first;
    T second;

    public Pair(V first, T second){
        this.first = first;
        this.second = second;
    }
    public Pair(){

    }
    
    void setFirst(V first){
        this.first = first;
    }

    V getFirst(){
        return this.first;
    }

    // void addToFirst(Integer x){
    //     this.first += x;
    // }

    static <K, L> K doSomething(K x, L y){
        K something =null;
        return something;
    }
    static <K> void doSomething2(){
        K something;
        // usesomething 
    }
}
