package DesignPatterns.PrototypeAndRegistry;

public class AcademyStudent extends Student{
    int iq;
    String libraryPass;

    public AcademyStudent(AcademyStudent ast){
        super(ast);
        this.iq = ast.iq;
        this.libraryPass = ast.libraryPass;
    }

    public AcademyStudent copy(){
        return new AcademyStudent(this);
    }
}
