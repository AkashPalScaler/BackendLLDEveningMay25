package DesignPatterns.Builder;

import DesignPatterns.Builder.Student.StudentBuilder;

public class Client {
    public static void main(String[] args) {
        //Version 1
        // StudentBuilder studentBuilder = new StudentBuilder();
        // studentBuilder.setName("Akash");
        // studentBuilder.setAge(23);
        // studentBuilder.setBatch("Morning25");
        // studentBuilder.setPSP(1.5f);

        // Student student = new Student(studentBuilder);

        //version 2
        // StudentBuilder studentBuilder = Student.getBuilder();
        // studentBuilder.setName("Akash");
        // studentBuilder.setAge(23);
        // studentBuilder.setBatch("Morning25");
        // studentBuilder.setPSP(1.5f);

        // Student student = new Student(studentBuilder);


         //version 3
        //  StudentBuilder studentBuilder = 
        //      Student.getBuilder()
        //             .setName("Akash")
        //             .setAge(23)
        //             .setBatch("Morning25")
        //             .setPSP(1.5f);
 
        //  Student student = new Student(studentBuilder);


         //version 4

        // StudentBuilder sb = new Student.StudentBuilder();
        Student student = Student.getBuilder()
                                .setName("Akash")
                                .setAge(23)
                                .setBatch("Morning25")
                                .setPSP(1.5f)
                                .build();

        Student st = new Student(null);

        

 
    }
    
}
//Student
//StudentBuilder
//StudentProfile
//StudentProfileBuilder

//Car - 20 properties
// SUVCarsBuilder - 10 needed from user / 10 property default
// HatchBackCarBuilder - 15
// SedanBuilder - 12

// Car.getBuilder("Sedan")



