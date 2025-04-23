import java.util.ArrayList;
import java.util.Scanner;
public class TaskFour {
    static ArrayList<Student> list=new ArrayList<>();
    public static void main(String[] args) {
        boolean exit=false;
        Scanner scanner=new Scanner(System.in);
        String x;
        
        do{
            System.out.println("Enter (add) to add a new student");
            System.out.println("Enter (show) to show all students");
            System.out.println("Enter (search) to search student by its name");
            System.out.println("Enter (searchAll) to search student");
            System.out.println("Enter (avg) to compute and display the class average");
            System.out.println("Enter (exit) to end the process");
            String input=scanner.nextLine();
            switch(input){
                case "add":
                    do{
                        add_student(scanner);
                        System.out.println("do you want to add a new student (y/n)?");
                        x=scanner.nextLine().toLowerCase();
                    }while(x.equals("y"));
                    break;
                case "show":
                    show_all_student(list);
                    break;
                case "search":
                    System.out.println("Enter the student name you are searching");
                    x=scanner.nextLine();
                    search_one(list,x);
                    break;
                case "searchAll":
                    System.out.println("Enter the  name to display all students who share the same name");
                    x=scanner.nextLine();
                    search_many(list,x);
                    break;
                case "avg":
                    compute_aveage_notes(list);
                    break;
                default:
                    exit=true;
                    break;
            }
            
        }while(!exit);
        scanner.close();
    }
    public static void add_student(Scanner scanner){
        System.out.println("Enter the student's name");
        String name=scanner.nextLine();
        System.out.println("Enter the student's TP note ");
        Double tpNote=scanner.nextDouble();
        scanner.nextLine();
        list.add(new Student(name,tpNote)) ;
        System.out.println("The student has been added to the list");
    }
    public static void show_all_student(ArrayList<Student> list){
        for(Student e:list){
            e.show();
        }
    }
    public static void search_one(ArrayList<Student> list,String name){
        for(Student e:list){
            if (e.name.equals(name)){
                System.out.println("The student exists : ");
                e.show();
                break;
            }
        }
    }
    public static void search_many(ArrayList<Student> list,String name){
        for(Student e:list){
            if (e.name.equals(name)){
                System.out.println("The student  : ");
                e.show();
            }
        }
    }
    public static void compute_aveage_notes(ArrayList<Student> list){
        Double avg=0.0;
        if(!list.isEmpty()){
            for(Student e:list){
            avg+=e.tpNote;
            }
            avg=avg/list.size();
        }
        
        System.out.println("The average of all class is :"+avg);
        
    }
}
