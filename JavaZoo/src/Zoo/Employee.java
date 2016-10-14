package Zoo;

import java.util.Scanner;

/**
 * Created by christiancampbell on 10/12/16.
 */
public class Employee extends Person {

    public static Scanner scannerE = new Scanner (System.in);

    String id;
    public Employee(String n, String g, String a, String I) {
        super(n, g, a);
        id = I;
    }


    public static String getID(){
        System.out.println("What is the ID number?");
        String id1 = scannerE.nextLine();
        return id1;
    }

    public static String getName(){
        System.out.println("What is your name?");
        String name1 = scannerE.nextLine();
        return name1;
    }

    public static String getGender(){
        System.out.println("What is your gender?");
        String gender1 = scannerE.nextLine();
        return gender1;
    }
    public static String getAge(){
        System.out.println("What is your age?");
        String age1 = scannerE.nextLine();
        return age1;
    }

    public static void buildAPerson(){
        Employee e1 = new Employee (getName(), getGender(), getAge(), getID());

        list.add(e1.displayInfo());
        System.out.println(e1.displayInfo());


    }
    public String displayInfo(){
        return "**************" + "\n" + "Employee:" + "\n" + "Name: " + name + "\n" + "Gender: " + gender + "\n" + "Age: " + age + "\n" + "ID Number :" + id;

    }
//    public static void displayArray(){
//        System.out.println("People that are employees.: " + "\n");
//        for(String Items : list){
//            System.out.println(Items + "\n");
//        }
}
