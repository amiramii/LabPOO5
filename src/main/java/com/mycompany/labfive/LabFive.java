package com.mycompany.labfive;
import java.util.Scanner;
import java.util.ArrayList;
public class LabFive {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> list= new ArrayList<String>();
        System.out.println("how many items?");
        int number=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<number;i++){
            System.out.println("Enter a value");
            String v=scanner.nextLine();
            list.add(v);
            System.out.println(list);
        }
        System.out.println(list.size());
        System.out.println("Enter the element to search");
        String x=scanner.nextLine();
        int count=Search(list,x);
        if(count>=1){
            System.out.println(x+" exists");
        }
        if(count>1){
            search(list,x);
            System.out.println(list);
        }
        
       scanner.close();
       
        
        
    }
    static int Search(ArrayList<String> list,String x){
        int cpt=0;
        for(String e:list){
            if(e.equals(x)){
                 cpt++;
            }
            
        }
        return cpt;
    }
    static ArrayList<String> search(ArrayList<String> list,String x){
        ArrayList<String> newList = new ArrayList<>();
        boolean Added = false;
        
        for (String s : list) {
            if (s.equals(x)) {
                if (!Added) {
                    newList.add(s);
                    Added = true;
                }
            } else {
                newList.add(s);
            }
        }
        
        return newList;
    }
    
}
