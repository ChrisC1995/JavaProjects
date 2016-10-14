package Zoo;


import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by christiancampbell on 10/11/16.
 */
public class Person {

    public static ArrayList <String> list = new ArrayList<>();

    public static Scanner scanner = new Scanner (System.in);

    public String name;
    public String gender;
    public String age;

    public Person(String n, String g, String a){

        name = n;
        gender = g;
        age = a;
    }

    public static String getName(){
        System.out.println("What is your name?");
        String name1 = scanner.nextLine();
        return name1;
    }

    public static String getGender(){
        System.out.println("What is your gender?");
        String gender1 = scanner.nextLine();
        return gender1;
    }
    public static String getAge(){
        System.out.println("What is your age?");
        String age1 = scanner.nextLine();
        return age1;
    }

//    public static void buildAPerson(){
//        Person p1 = new Person (getName(), getGender(), getAge());
//
//        list.add(p1.displayInfo());
//        System.out.println(p1.displayInfo());
//
//
//    }
//    public String displayInfo(){
//        return "Name: " + name + "\n" + "Gender: " + gender + "\n" + "Age: " + age;
//
//    }
    public static void displayArray(){
        System.out.println("People in the zoo: " + "\n");
        for(String Items : list){
            System.out.println(Items + "\n");
    }}
    public static void pick(){
        System.out.println("Are you going to record an employee or visitor? Press 1 for employee. Please 2 for visitor.");
        int choice1 = scanner.nextInt();
        switch(choice1){
            case 1:
                Employee.buildAPerson();
                break;
            case 2:
                Visitor.buildAPerson();
                break;
        }
}
}
