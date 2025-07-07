// package DesignPatterns.Builder;

// public class StudentBuilder {
//     String name;
//     Integer age;
//     Float psp;
//     String batch;

//     StudentBuilder setName(String name){
//         this.name = name;
//         return this;
//     }

//     StudentBuilder setAge(Integer age){
//         this.age = age;
//         return this;
//     }
    
//     StudentBuilder setPSP(Float psp){
//         this.psp = psp;
//         return this;

//     }
//     StudentBuilder setBatch(String batch){
//         this.batch = batch;
//         return this;

//     }

//     Student build(){
//         if(this.name == null){
//             throw new RuntimeException("Name can't be null");
//         }
//         if(this.age < 18){
//             throw new RuntimeException("Student must be an adult");
//         }
//         return new Student(this);
//     }
// }
