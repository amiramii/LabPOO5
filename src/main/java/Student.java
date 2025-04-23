
public class Student {
    static int id=0;
    String name;
    Double tpNote;
    Student(String name,Double tpNote){
        this.name=name;
        this.tpNote=tpNote;
        id++;
        
    }
    void show(){
        System.out.println("Student Id: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student TP note : "+tpNote);
        
        
    }
    
    
}
